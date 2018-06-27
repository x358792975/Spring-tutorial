package com.selflearning.spring.test.sample1.collections;

import java.util.List;

import com.selflearning.spring.test.sample1.Car;

public class Person {
	private int age;
	private String name;

	private Car car;
	private List<Car> cars;
	
	public Person() {

	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", cars=" + cars + "]";
	}

	public Person(int age, String name, List<Car> cars) {
		super();
		this.age = age;
		this.name = name;
		this.cars = cars;
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello!");
	}


	public Person(int age, String name, Car car) {
		super();
		this.age = age;
		this.name = name;
		this.car = car;
	}

	public Person(int age, String name, Car car, List<Car> cars) {
		super();
		this.age = age;
		this.name = name;
		this.car = car;
		this.cars = cars;
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

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	

}