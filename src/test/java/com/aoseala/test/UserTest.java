/**
 * 
 */
package com.aoseala.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aoseala.test.domain.User;
import com.aoseala.test.service.UserService;

/**
 * @author Owner
 * 
 */
// 整合
@RunWith(SpringJUnit4ClassRunner.class)
// 加载配置
@ContextConfiguration(locations = "classpath:root-context.xml")
public class UserTest {

	@Autowired
	// 注入
	private UserService userService;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
		User user = new User();
		user.setUsername("Aoseala");
		user.setUserage(20);
		user.setUseraddress("人民路");
		assertTrue(this.userService.insert(user) > 0);
	}

	@Test
	public void testSelect() {
		List<User> list = this.userService.findAll();
		for (User user : list)
			System.out.println(user.getUsername());
	}

	@Test
	public void testUpdateByPkSelective() {
		User user = new User();
		user.setId(1);
		user.setUseraddress("广西 桂林市 七星区");
		System.out.println("影响的行数："+this.userService.updateByPkSelectvie(user));
	}

}
