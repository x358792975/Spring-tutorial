package com.selflearning.spring.test.sample1.autowire;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		Person person = (Person) ctx.getBean("person");
		
		System.out.println(person);
	}

}
