package com.portfolio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.portfolio.models.User;

public interface IUserRepository extends CrudRepository<User, String> {

	@Query(value = "select * from users where username=:username", nativeQuery = true)
	User findByUsername(@Param("username") String usuario);
	

}
