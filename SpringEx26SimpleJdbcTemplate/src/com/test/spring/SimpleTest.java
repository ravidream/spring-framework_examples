package com.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class SimpleTest {
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	EmployeeDao dao=(EmployeeDao)factory.getBean("employeeDao");
	int status=dao.update(new Employee(23,"Tarun",5000));
	System.out.println(status);
}
}
