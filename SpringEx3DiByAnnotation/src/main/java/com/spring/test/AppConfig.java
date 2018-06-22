package com.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ravi Thapa
 */
@Configuration
@ComponentScan(basePackages="com.spring.test")
public class AppConfig {
   @Bean
   public Employee getEmployee() {
      return new EmployeeImp();
   }
   
   @Bean
   public Department getDepartment(){
      return new DepartmentImp();
   }
}
