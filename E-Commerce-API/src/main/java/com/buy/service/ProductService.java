package com.buy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buy.model.Product;
import com.buy.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo pRepo;
	
	public List<Product> getAllProduct(){
		
		return pRepo.findAll();
	}
	
	public void addProducts(Product product) {
		
		pRepo.save(product);
	}
	
	public void removeProductById(long id) {
		pRepo.deleteById(id);
	}
	
	public Optional<Product> getProductById(long id){
		
		return pRepo.findById(id);
	}
	
	public List<Product> getProductByCategoriesId(int id){
		return pRepo.findAllByCategory_Id(id);
	}

}
