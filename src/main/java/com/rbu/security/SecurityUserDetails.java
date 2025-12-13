package com.rbu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rbu.dao.PersonRepository;
import com.rbu.model.Person;

@Service
public class SecurityUserDetails implements UserDetailsService {
	
	@Autowired
	PersonRepository personRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Person person = personRepository.findByUserName(username);
		return User.builder().username(person.getUserName()).password(person.getPassword())
				               //.authorities("USER")
				              .build();
//		return User
//				  .withUsername(person.getUserName())
//				  .password(person.getPassword())
//				  .build();
	}

}
