package com.webwordmarson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwordmarson.curso.entities.OrdemItem;

public interface OrdemItemRepository extends JpaRepository<OrdemItem, Long> {
	
	
	
}
