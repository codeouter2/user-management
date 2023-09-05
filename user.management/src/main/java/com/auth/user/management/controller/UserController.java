package com.auth.user.management.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.user.management.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	final static Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@GetMapping("/captcha")
	public ResponseEntity<Object> generateCaptcha() throws Exception {
		logger.trace("Entry into captcha");
		ResponseEntity<Object> captcha = userService.captcha();
		logger.trace("Exit from captcha");
		return captcha;
	}
}
