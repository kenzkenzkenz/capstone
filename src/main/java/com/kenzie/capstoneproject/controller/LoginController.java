package com.kenzie.capstoneproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String loginPage() {
//		return "login";
//	}
	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String welcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
//		if (userId.equals("admin") && password.equals("root")) {
//			model.put("userId", userId);
//			return "welcome";
//		}
//		
//		model.put("errorMsg", "please provide correct userId and password");
//		return "login";
//	}
}