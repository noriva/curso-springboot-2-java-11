package com.webwordmarson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwordmarson.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	
}
