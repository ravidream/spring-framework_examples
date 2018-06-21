package com.spring.test;

import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class Employee {
	private int id;
	private String name;
	private List<String> addresses;

	public Employee() {
	}

	public Employee(int id, String name, List<String> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}

	public void displayInfo() {
		System.out.println("Emp Id: "+id + " Name : " + name);
		System.out.println("Address are:");
		Iterator<String> itr = addresses.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
