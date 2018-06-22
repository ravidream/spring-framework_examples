package com.spring.test;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Ravi Thapa
 */
@Configuration
@ComponentScan(basePackages = "com.spring.test")
public class AppConfig {
   @Bean("accountService")
   @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
   public AccountService getAccountService() {
      return new AccountService();
   }
}
