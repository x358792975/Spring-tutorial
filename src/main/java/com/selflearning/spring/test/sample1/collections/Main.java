package com.selflearning.spring.test.sample1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.selflearning.spring.test.sample1.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		Car car= (Car) ctx.getBean("car");
		System.out.println(car);
		
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		
		Person2 newPerson = (Person2) ctx.getBean("person2");
		System.out.println(newPerson);
		*/
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getProperties());
	}

}
