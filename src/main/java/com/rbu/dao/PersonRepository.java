package com.rbu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.rbu.model.Person;

@Repository
public interface PersonRepository  extends JpaRepository <Person, Long> {
	
	Person findByUserName(String userName);
}
