package com.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.test.hello.HelloWorld;
import com.spring.test.hello.impl.HelloWorldImpl;

/**
 * 
 * @author Ravi Thapa
 *
 */
@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }	
}