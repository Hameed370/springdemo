package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//
//
//
@Controller
@RequestMapping(value={"/","/home"})
public class HomeController {

	@RequestMapping(value={"/","/index","/home"})
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String aboutus() {
		return "AboutUs";
	}
	
	@RequestMapping(value={"/contact","/contactus"})
	public String  callus() {
		return "Contact";
	}
	
	@RequestMapping("/nav")
	public String  nav() {
		return "navlink";
	}
	
	
}
