package com.selflearning.spring.test.sample1.annotation.repository;

public class UserJdbcRepository implements UserRepository {

	public void save() {

		System.out.println("UserJdbcRepository save....");
	}
	
}
