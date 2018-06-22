package com.spring.test.hello.impl;

import com.spring.test.hello.HelloWorld;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class HelloWorldImpl implements HelloWorld {

	@Override
	public void printHelloWorld(String msg) {
		System.out.println("Hello : " + msg);
	}
}