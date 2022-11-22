package com.buy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.buy.model.Category;
import com.buy.service.CategoryService;

@Controller
public class AdminController {
	
	@Autowired
	CategoryService cs;
	
	@GetMapping("/admin")
	public String admin() {
		return "adminHome";
	}
	
	
	@GetMapping("/admin/categories")
	public String getCat(Model model) {
		
		model.addAttribute("categories", cs.getAllCategory());
		return "categories";
	}
	
	@GetMapping("/admin/categories/add")
	public String getCatAdd(Model model) {
		
		model.addAttribute("category", new Category());
		return "categoriesAdd";
	}
	
	@PostMapping("/admin/categories/add")
	public String PostCatAdd(@ModelAttribute("category") Category category) {
		
		cs.addCategory(category);
		return "redirect:/admin/categories";
	}
	
	
	@GetMapping("/admin/categories/delete/{id}")
	public String DeletCat(@PathVariable int id) {
		
		cs.removeCategoryById(id);
		return "redirect:/admin/categories";
		
	}
	
	
	
}
