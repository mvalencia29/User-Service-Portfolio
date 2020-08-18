package com.portfolio.response;

import com.portfolio.models.User;
import com.portfolio.response.result.Result;

public class ResponseUserAuthentication {
	
	private User user;
	
	private Result result;
	
	public ResponseUserAuthentication(Result result) {
		this.result = result;
	}
	
	public ResponseUserAuthentication(User user, Result result) {
		this.user = user;
		this.result = result;
	}
	
	public User getUser() {
		return user;
	}
	
	public Result getResult() {
		return result;
	}
}
