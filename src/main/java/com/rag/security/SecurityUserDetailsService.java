package com.rag.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rag.dao.PersonRepository;
import com.rag.model.Authority;
import com.rag.model.Person;

@Service
public class SecurityUserDetailsService implements UserDetailsService {

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Person person = personRepository.findByEmail(username);
		List<GrantedAuthority> authorities =  new ArrayList<>();
		List<Authority> authoritiesFromDB = person.getAuthority();
		for(Authority authority: authoritiesFromDB) {
			authorities.add(new SimpleGrantedAuthority("ROLE_"+authority.getRole()));
		}
		return User
				  .builder()
				  .username(person.getEmail())
				  .password(person.getPassword())
				  .authorities(authorities)
                  .build();
	}

}
