package com.renatomellotech.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatomellotech.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
