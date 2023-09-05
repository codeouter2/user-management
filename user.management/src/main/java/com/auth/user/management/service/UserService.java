package com.auth.user.management.service;

import org.springframework.http.ResponseEntity;

public interface UserService {

	public ResponseEntity<Object> captcha() throws Exception ;
}
