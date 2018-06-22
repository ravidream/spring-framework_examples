package com.test.spring;

import org.aspectj.lang.JoinPoint;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class TrackOperation {
	
	public void testAdvice(JoinPoint jp){//it is advice

		System.out.println("Additional concern");
		//System.out.println("Method Signature: "  + jp.getSignature());
	}
}
