package com.webwordmarson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwordmarson.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	
}
