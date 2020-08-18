package com.portfolio.service.authentication;

import com.portfolio.models.UserAuthentication;
import com.portfolio.response.ResponseUserAuthentication;

public interface IUserAuthenticationService {

	ResponseUserAuthentication authenticate(UserAuthentication user);
	
}
