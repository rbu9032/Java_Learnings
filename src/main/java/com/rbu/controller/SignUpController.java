package com.rbu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.dao.PersonRepository;
import com.rbu.model.Person;

@RestController
public class SignUpController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	PersonRepository userRepository;
	
	@PostMapping("/signup")
	public Person signUp(@RequestBody Person user) {
		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		return userRepository.save(user);
	}

}
