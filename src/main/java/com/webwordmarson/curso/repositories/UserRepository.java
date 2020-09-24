package com.webwordmarson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwordmarson.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
