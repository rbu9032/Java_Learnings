package com.rbu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.model.Props;

@RestController
public class TestController {

	@Autowired
	Props props;
	
	@GetMapping("/props")
	public Props getProps(){
		return props;	
	}
}
