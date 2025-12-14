package com.rag.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/sample")
	@PreAuthorize("hasRole('SUPERADMIN')")
	public String sample() {
		return "Sample endpoint is working";
	}
	@PostMapping("/validation")
	public String validation() {
		return "JWT Token Validation is working";
	}

	@GetMapping("/add")
	public String add() {
		return "Successfully added a product";
	}
	@GetMapping("/revenue")
	public String revenue() {
		return "Your are viewing revenu";
	}
}
