package com.selflearning.spring.test.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/selflearning/spring/test/sample1/beans/beans.xml");

		Person p = (Person) context.getBean("person");
		Car car = context.getBean(Car.class);
		
		//Address a = (Address)context.getBean("address");
		//Address ads = (Address)context.getBean(Address.class);
		p.speak();
		//System.out.println(a);
		System.out.println(p);
		System.out.println(car);
		((ClassPathXmlApplicationContext)context).close();
	}
}
