package com.aoseala.test.service;

import java.util.List;
import java.util.Map;

import com.aoseala.test.domain.User;

public interface UserService {
	public int insert(final User user);
	
	public List<User> findAll();
	
	public int updateByPkSelectvie(final User user);
	
	public int deleteByPk(final int pk);
	
	public List<Map<String,Object>> selectPostUser(final int id);
	
	public User getById(int id);
}
