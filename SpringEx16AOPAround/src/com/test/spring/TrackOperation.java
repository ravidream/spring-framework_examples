package com.test.spring;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class TrackOperation {
	public Object testAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Additional Concern Before calling actual method");
		Object obj=pjp.proceed();
		System.out.println("Additional Concern After calling actual method");
		return obj;
	}
}
