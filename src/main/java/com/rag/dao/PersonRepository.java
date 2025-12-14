package com.rag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rag.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	
	public Person findByEmail(String email);
}
