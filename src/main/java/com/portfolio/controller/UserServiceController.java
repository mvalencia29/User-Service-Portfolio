package com.portfolio.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.models.UserAuthentication;
import com.portfolio.response.ResponseUserAuthentication;
import com.portfolio.service.authentication.IUserAuthenticationService;

@RestController
@RequestMapping("/api/user")
public class UserServiceController {

	@Autowired
	private IUserAuthenticationService userAuthenticationService;
	
	@PostMapping("/authenticate")
	public ResponseUserAuthentication authenticateUser(@Valid @RequestBody UserAuthentication userAuthentication) {
		return userAuthenticationService.authenticate(userAuthentication);
	}
	
}
