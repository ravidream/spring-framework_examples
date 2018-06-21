package com.spring.test;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class Employee {
	private int id;
	private String name;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void displayInfo() {
		System.out.println("Emp Id : "+id + " Emp Name : " + name);
		System.out.println("Address : " + address);
	}

}
