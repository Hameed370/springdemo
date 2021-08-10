package com.niit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.models.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/register")
	public String register(ModelMap map) {
		map.addAttribute("user", new User());
		return "Register";
	}
	
	@RequestMapping("/add")
	public String add(@ModelAttribute("user") User u) {
		System.out.println(u);
		//jdbc code
		//dao pattern.
		return "redirect:/user/login";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "Login";
	}
}
