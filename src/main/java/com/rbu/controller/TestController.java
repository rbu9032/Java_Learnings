package com.rbu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class TestController {

	@GetMapping("/hi")
	public String hi() {
		return "Hi";
	}
	@GetMapping("/bye")
	public String bye() {
		return "Bye";
	}
	@GetMapping("/open")
	public String open() {
		return "Open For All";
	}
	@GetMapping("/noaccess")
	public String noAccess() {
		return "No Access";
	}
}


