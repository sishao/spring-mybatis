package com.aoseala.test.service;

import java.util.List;

import com.aoseala.test.domain.User;

public interface UserService {
	public int insert(final User user);
	
	public List<User> findAll();
}
