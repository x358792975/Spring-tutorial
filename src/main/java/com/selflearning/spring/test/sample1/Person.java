package com.selflearning.spring.test.sample1;

public class Person {
	private int id;
	private String name;
private Address address;
	private int taxId;

	public Person() {

	}

	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello!");
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", taxId=" + taxId + "]";
	}


	

}
