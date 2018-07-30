package com.selflearning.spring.test.sample1.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("postProcessBeforeInitialization." + bean + ", " + beanName);
		if("car".equals(beanName)) {
			
		}
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("postProcessAfterInitialization." + bean + ", " + beanName);
		
		Car car = new Car();
		car.setBrand("Toyota");
		return car;
	}
}
