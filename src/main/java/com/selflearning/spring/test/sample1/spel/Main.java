package com.selflearning.spring.test.sample1.spel;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-spel.xml");

		Address address = (Address) ctx.getBean("address");
		Car car = (Car) ctx.getBean("car");
		Person person = (Person) ctx.getBean("person");

		System.out.println(address);
		System.out.println(car);
		System.out.println(person);
	}

}
