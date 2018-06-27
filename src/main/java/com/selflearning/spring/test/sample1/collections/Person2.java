package com.selflearning.spring.test.sample1.collections;

import java.util.List;
import java.util.Map;

import com.selflearning.spring.test.sample1.Car;

public class Person2 {
	private int age;
	private String name;

	private Car car;
	private Map<String,Car> cars;
	
	public Person2() {

	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", cars=" + cars + "]";
	}



	public Person2(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello!");
	}


	public Person2(int age, String name, Car car) {
		super();
		this.age = age;
		this.name = name;
		this.car = car;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Car getCar() {
		return car;
	}

	public Map<String, Car> getCars() {
		return cars;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}



	

}