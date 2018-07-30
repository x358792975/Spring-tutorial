package com.selflearning.spring.test.sample1.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.selflearning.spring.test.sample1.annotation.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	


		@Autowired
		public void execute() {
			System.out.println("UserController execute.....");
			userService.add();
		}
}
