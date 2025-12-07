package com.rbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rbu.dao.UserRespository;
import com.rbu.model.User;


@Service
public class UserPageService {
	
	@Autowired
	UserRespository userRepository;
	
	public Page<User> getUserByPage(int pageNumber, int size) {
		PageRequest of = PageRequest.of(pageNumber, size);
		Page<User> findAll = userRepository.findAll(of);
		return findAll;
	}
	

	public Page<User> getUserByPageAndSort(int pageNumber, int size) {
		Sort ascending = Sort.by("name").ascending();
		PageRequest of = PageRequest.of(pageNumber, size, ascending);
		Page<User> findAll = userRepository.findAll(of);
		return findAll;
	}

}
