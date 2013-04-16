/**
 * 
 */
package com.aoseala.test.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aoseala.test.domain.Post;
import com.aoseala.test.domain.User;
import com.aoseala.test.domain.UserExample;
import com.aoseala.test.persistence.PostMapper;
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

	@Autowired
	PostMapper postMapper;

	@Override
	public int insert(User user) {
		// Post post = new Post();
		// post.setUid(1);
		// post.setTitle("ddddd");
		// post.setContent("ddddddddddd");
		// post.setCreatetime(new Date());
		// if(this.postMapper.insert(post)>0){
		// throw new RuntimeException();
		// }

		return this.userMapper.insert(user);
	}

	@Override
	public List<User> findAll() {
		UserExample userExample = new UserExample();
		return this.userMapper.selectByExample(userExample);
	}

	@Override
	public int updateByPkSelectvie(User user) {
		return this.userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int deleteByPk(int pk) {
		return this.userMapper.deleteByPrimaryKey(pk);
	}

}
