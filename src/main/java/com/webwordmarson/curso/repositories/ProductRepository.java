package com.webwordmarson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.webwordmarson.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
