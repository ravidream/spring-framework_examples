package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ravi Thapa
 */

@Component
public class Company {

   private Employee employee;
   private Department department;

   // Constructor based DI
   @Autowired
   public Company(Employee employee) {
      this.employee = employee;
   }

   public void showEmployeeInfo() {
      employee.showEmployeeInfo();
   }

   // Setter method based DI
   @Autowired
   public void setDepartment(Department department) {
      this.department = department;
   }

   public void showDepartmentInfo() {
      department.showDepartmentInfo();
   }
}
