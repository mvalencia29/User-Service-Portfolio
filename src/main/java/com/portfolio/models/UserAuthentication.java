package com.portfolio.models;

import javax.validation.constraints.NotBlank;

public class UserAuthentication {
	
	@NotBlank(message = "username cannot be null")
	private String username; 
	
	@NotBlank(message = "password cannot be null")
	private String password;
	
	public UserAuthentication(){}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username; 
	}
	
	public String getPassword() {
		return password;
	}

}
