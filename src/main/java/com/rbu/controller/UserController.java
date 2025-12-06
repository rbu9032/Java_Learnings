package com.rbu.controller;

import com.rbu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    
    @GetMapping("/save")
    public String saveUser(){
       String name =  userService.save();
        return name;
    }
    @GetMapping("/user")
    public void getUser() {
    	userService.findUser();
    }
    @GetMapping("/users")
    public void getAllUsers() {
    	userService.findAllUsers();
    }
}
