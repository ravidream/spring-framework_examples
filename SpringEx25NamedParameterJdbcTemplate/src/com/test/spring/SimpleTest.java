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
	
	Resource resource = new ClassPathResource("applicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	
	EmployeeDao dao=(EmployeeDao)factory.getBean("employeeDao");
	dao.save(new Employee(23,"Ravi",4000));
	
  }
}