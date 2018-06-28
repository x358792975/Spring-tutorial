package com.selflearning.spring.test.sample1.spel;

public class Person {
	private String name;
	private Car car;
	
	//based on car price, if price >= 50000, mid-level
	private String info;
	
	//from bean address
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", info=" + info + ", city=" + city + "]";
	}

	
	
	
}
