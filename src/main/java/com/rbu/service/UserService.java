package com.rbu.service;

import org.springframework.stereotype.Service;

import com.rbu.dao.UserRepository;
import com.rbu.exception.UserIdNotFoundException;
import com.rbu.model.User;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User save(User user) {
		User savedUser = userRepository.save(user);
		log.info("Fetched User deatils: {}", savedUser);
		return savedUser;
	}

	public User getUser(long id) {
		return userRepository.findById(id).orElseThrow(()-> new UserIdNotFoundException("User Id not found"));	
	}
}
