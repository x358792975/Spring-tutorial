package com.selflearning.spring.test.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/selflearning/spring/test/sample1/beans/beans.xml");
    	
    	Person p = (Person)context.getBean("person");
    	p.speak();
    	((ClassPathXmlApplicationContext)context).close();
    }
}