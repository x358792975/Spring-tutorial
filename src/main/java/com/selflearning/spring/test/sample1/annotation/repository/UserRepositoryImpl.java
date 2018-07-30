package com.selflearning.spring.test.sample1.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selflearning.spring.test.sample1.annotation.TestObject;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

		@Autowired(required=false)
		private TestObject testObject;
	@Autowired
	public void save() {
		System.out.println("UserRepository Save.....");
		System.out.println(testObject);
	}
}
