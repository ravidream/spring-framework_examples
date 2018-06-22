package com.test.spring;

import java.util.List;

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
		List<Employee> list=dao.getAllEmployees();
		
		for(Employee employee : list)
			System.out.println(employee);		
	}
}
