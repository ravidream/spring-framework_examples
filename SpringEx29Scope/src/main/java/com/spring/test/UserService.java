package com.spring.test;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Ravi Thapa
 *
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class UserService {

   private String userName;

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
}
