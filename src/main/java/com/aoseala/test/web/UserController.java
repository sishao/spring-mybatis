package com.aoseala.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/login",method={RequestMethod.GET})
	public String login() {
		return "user/login";
	}
}
