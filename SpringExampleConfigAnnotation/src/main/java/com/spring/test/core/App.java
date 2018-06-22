package com.spring.test.core;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.test.AppConfig;
import com.spring.test.hello.HelloWorld;
 
/**
 * 
 * @author Ravi Thapa
 *
 */
public class App {
	public static void main(String[] args) {	    
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");	    
	    obj.printHelloWorld("Spring3 Java Config");
	}
}