package com.example.demoproduct.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproduct.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	

}
