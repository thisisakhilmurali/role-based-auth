package com.jwt.implementation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.implementation.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmail(String username);

}
