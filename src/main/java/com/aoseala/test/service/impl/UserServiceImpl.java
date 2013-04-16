/**
 * 
 */
package com.aoseala.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aoseala.test.domain.User;
import com.aoseala.test.domain.UserExample;
import com.aoseala.test.persistence.UserMapper;
import com.aoseala.test.service.UserService;

/**
 * @author Owner
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public int insert(User user) {
		return this.userMapper.insert(user);
	}

	@Override
	public List<User> findAll() {
		UserExample userExample = new UserExample();
		return this.userMapper.selectByExample(userExample);
	}

}
