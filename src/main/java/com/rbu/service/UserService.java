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
}
