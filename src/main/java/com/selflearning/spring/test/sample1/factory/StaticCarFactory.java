package com.selflearning.spring.test.sample1.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Sean
 * 
 */
public class StaticCarFactory {
	
	private static Map<String, Car> cars = new HashMap<String,Car>();
	
	static {
		cars.put("Audi", new Car("Audi", 50000));
		cars.put("Honda", new Car("Toyota", 30000));
	}
	public static Car getCar(String name) {
		
		return cars.get(name);
	}
}
