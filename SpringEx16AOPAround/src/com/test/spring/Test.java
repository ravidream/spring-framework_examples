package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class Test{
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		Operation operation = (Operation) context.getBean("testBean");
		operation.firstMethod();
		operation.secondMethod();
	}
}

