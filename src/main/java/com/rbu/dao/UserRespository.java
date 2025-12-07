package com.rbu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rbu.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Integer> {

	@Query("Select u from User u where name=:name")
	List<User> findByUserName(@Param("name")String name);

	@Query(value="select * from user where age=?1", nativeQuery=true)
	List<User> findByUserAge(int age);
	
	User findByName(String name);
	
	List<User> findByNameAndAge(String name, int age);
	
	List<User> findByNameOrAge(String name, int age);
	
	List<User> findByNameStartingWith(String name);
	
	List<User> findByNameEndingWithIgnoreCase(String name);
}
