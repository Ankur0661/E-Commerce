package com.buy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buy.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	

	List<Product> findAllByCategory_Id(int id);

}
