package com.selflearning.spring.test.sample1.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private Map<String, Car> cars = null;
	
	public InstanceCarFactory() {
		cars = new HashMap<String, Car>();
		cars.put("Audi", new Car("Honda",30000));
		cars.put("Ford", new Car("Ford", 55000));
	}
	public Car getCar(String brand) {
		return cars.get(brand);
	}
	
}
