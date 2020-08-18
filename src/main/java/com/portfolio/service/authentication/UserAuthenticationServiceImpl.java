package com.portfolio.service.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.models.User;
import com.portfolio.models.UserAuthentication;
import com.portfolio.repository.IUserRepository;
import com.portfolio.response.ResponseUserAuthentication;
import com.portfolio.response.result.Result;

@Service
public class UserAuthenticationServiceImpl implements IUserAuthenticationService {

	@Autowired
	private IUserRepository iUserRepository;

	@Override
	public ResponseUserAuthentication authenticate(UserAuthentication userAuthentication) {

		User user = iUserRepository.findByUsername(userAuthentication.getUsername());

		if (user != null) {
			
			if (user.getPassword().equals(userAuthentication.getPassword()))
				return new ResponseUserAuthentication( user, new Result(200, "The credentials are correct"));

			return new ResponseUserAuthentication(new Result(201, "the password is incorrect"));
		}

		return new ResponseUserAuthentication(new Result(202, "The user doesn’t exist"));
	}

}
