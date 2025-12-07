package com.rbu.service;

import com.rbu.dao.UserRespository;
import com.rbu.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRespository userRespository;
    public String save(){
        User user = new User("Rajesh",27);
        User savedUser = userRespository.save(user);
        return savedUser.getName();
    }
    
    public void findUser() {
    	Optional<User> userInfo = userRespository.findById(1);
    	User user = userInfo.get();
    	System.out.println(user);
    }
    public void findAllUsers() {
    	List<User> users = userRespository.findAll();
    	System.out.println(users);
    }
    public void findUserByName() {
    	  List<User> findByUserName = userRespository.findByUserName("Akhil");
    	System.out.println(findByUserName);
    }
    public void findUserByAge() {
  	   List<User> findByUserAge = userRespository.findByUserAge(27);
  	System.out.println(findByUserAge);
  }
    
    public void userByName() {
    	User findByName = userRespository.findByName("Raghu");
    	System.out.println(findByName);
    }
    public List<User> userByNameAndAge(String name, int age) {
    	List<User> findByNameAndAge = userRespository.findByNameAndAge(name,age);
    	return findByNameAndAge;
    }
    public List<User> userByNameOrAge(String name, int age) {
    	List<User> findByNameOrAge = userRespository.findByNameOrAge(name,age);
    	return findByNameOrAge;
    }
    public List<User> userByNameStart(String name) {
    	List<User> findByNameStart = userRespository.findByNameStartingWith(name);
    	return findByNameStart;
    }
    public List<User> userByNameEnd(String name) {
    	List<User> findByNameEnd = userRespository.findByNameEndingWithIgnoreCase(name);
    	return findByNameEnd;
    }
}
