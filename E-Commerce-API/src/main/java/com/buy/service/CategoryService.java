package com.buy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buy.model.Category;
import com.buy.repository.CategoryRepo;


@Service
public class CategoryService {
	
	@Autowired
	CategoryRepo cRepo;
	
	public List<Category> getAllCategory(){
		return cRepo.findAll();
	}
	
	public void addCategory(Category category) {
		
		cRepo.save(category);
	}
	
	public void removeCategoryById(int id) {
		cRepo.deleteById(id);
	}
	
	public Optional<Category> getCategoryById(int id){
		return cRepo.findById(id);
	}
	

}
