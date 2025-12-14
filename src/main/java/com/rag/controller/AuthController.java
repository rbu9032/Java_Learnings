package com.rag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rag.dao.PersonRepository;
import com.rag.model.Person;
import com.rag.security.JWTService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JWTService jwtService;
	
	@PostMapping("/signup")
	public Person signUp(@RequestBody Person person) {
		String encodedpassword = passwordEncoder.encode(person.getPassword());
		person.setPassword(encodedpassword);
		return personRepository.save(person);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Person person) {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(person.getEmail(), person.getPassword()));	
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
		}
		String jwtToken = jwtService.generateToken(person.getEmail());
		return ResponseEntity.ok(jwtToken);
	}
}
