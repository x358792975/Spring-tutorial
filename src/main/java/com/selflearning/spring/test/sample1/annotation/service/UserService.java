package com.selflearning.spring.test.sample1.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selflearning.spring.test.sample1.annotation.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	
	@Autowired
	public void add() {
		System.out.println("UserService add.....");
		userRepository.save();
	}	
}
