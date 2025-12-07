package com.rbu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbu.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findByProductNameContaining(String productName);
}
