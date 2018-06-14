package com.selflearning.spring.test.sample1;

public class Car {
	private String brand;
	private String corp;
	private int price;
	private int maxSpeed;
	public Car(String brand, String corp, int price, int maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
