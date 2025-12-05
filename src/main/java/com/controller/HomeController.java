package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@RequestMapping("/home1")
	public String home() {
	    return "home";
	}
	
	@RequestMapping("/home2")
	@ResponseBody
	public String home2() {
	    return "home";
	}

}
