package com.rbu.restaurant.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.restaurant.dto.UserRequestDto;
import com.rbu.restaurant.dto.UserResponseDto;
import com.rbu.restaurant.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/adduser")
	public ResponseEntity<UserResponseDto> addUser(@RequestBody UserRequestDto userRequestDto) {
		UserResponseDto userResponseDto = userService.addUser(userRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);
	}

}
