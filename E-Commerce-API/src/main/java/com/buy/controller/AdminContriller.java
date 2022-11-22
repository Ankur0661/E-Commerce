package com.buy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminContriller {
	
	@GetMapping("/admin")
	public String admin() {
		return "adminHome";
	}

}
