package com.selflearning.spring.test.sample1.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 
 * @author Sean
 * customized FactoryBean needs to implement FactoryBean interface
 */
public class CarFactoryBean implements FactoryBean<Car>{

	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, 55000);
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}
}
