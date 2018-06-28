package com.selflearning.spring.test.sample1.property;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-property.xml");
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		
		System.out.println(dataSource.getConnection());
	}

}
