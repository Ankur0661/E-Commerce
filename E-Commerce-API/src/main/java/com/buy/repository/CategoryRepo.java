package com.buy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buy.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
