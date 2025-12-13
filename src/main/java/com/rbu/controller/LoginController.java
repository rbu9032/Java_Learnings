package com.rbu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	

	@GetMapping("/user/home")
	public String login() {
		return "You are logged in";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "Hi";
	}

}
