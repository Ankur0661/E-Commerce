package com.buy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.buy.service.CategoryService;
import com.buy.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	CategoryService cs;
	
	@Autowired
	ProductService ps;

	
	@GetMapping({"/","/home"})
	public String home(Model model) {
		return "index";
	}
	
	@GetMapping("/shop")
	public String shop(Model model) {
		
		model.addAttribute("categories", cs.getAllCategory());
		model.addAttribute("products", ps.getAllProduct());
		return "shop";
	}
	
	@GetMapping("/shop/category/{id}")
	public String shopbyCategory(Model model, @PathVariable int id) {
		model.addAttribute("categories", cs.getAllCategory());
		model.addAttribute("products", ps.getProductByCategoriesId(id));
		return "shop";
		
	}
	
	@GetMapping("/shop/viewproduct/{id}")
	public String viewProducts(@PathVariable long id, Model model) {
		model.addAttribute("product", ps.getProductById(id).get());
		
		return "viewProduct";
	}
	
	
	
	
	
	
	
	
}
