package com.selflearning.spring.test.sample1.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	@Autowired
	protected BaseRepository<T> repository;
	
	public void add() {
		
		System.out.println("Add .....");
		System.out.println(repository);
	}
}
