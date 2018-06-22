package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("employeeDao");
		int status = dao.saveEmployee(new Employee(103,"Ravi",1000));
		System.out.println(status);
		
		/*int status=dao.updateEmployee(new Employee(102,"Rakesh",200));
		System.out.println(status);*/
		
		
		/*Employee employee = new Employee();
		employee.setId(102);
		int status = dao.deleteEmployee(employee);
		System.out.println(status);*/		
	}
}
