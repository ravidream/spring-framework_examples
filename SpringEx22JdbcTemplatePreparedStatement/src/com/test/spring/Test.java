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
		dao.saveEmployeeByPreparedStatement(new Employee(109,"Akash",3000));		
	}
}
