package com.rbu.controller;

import com.rbu.model.User;
import com.rbu.service.UserPageService;
import com.rbu.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    
    @Autowired
    UserPageService userPageService;
    
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
    @GetMapping("/name")
    public void findByName() {
    	userService.findUserByName();
    }
    @GetMapping("/age")
    public void findByAge() {
    	userService.findUserByAge();
    }
    @GetMapping("/noquery")
    public void userName() {
    	userService.userByName();
    }
    @GetMapping("/nameandage")
    public List<User> userNameAndAge(@RequestParam(name="name")String name,@RequestParam(name="age")int age) {
    	List<User> nameAndAge =userService.userByNameAndAge(name, age);
    	return nameAndAge;
    }
    @GetMapping("/nameorage")
    public List<User> userNameOrAge(@RequestParam(name="name")String name,@RequestParam(name="age")int age) {
    	List<User> nameOrAge =userService.userByNameOrAge(name, age);
    	return nameOrAge;
    }
    @GetMapping("/namestart")
    public List<User> userNameStart(@RequestParam(name="name")String name) {
    	List<User> nameStart =userService.userByNameStart(name);
    	return nameStart;
    }
    @GetMapping("/nameend")
    public List<User> userNameEnd(@RequestParam(name="name")String name) {
    	List<User> nameEnd =userService.userByNameEnd(name);
    	return nameEnd;
    }
    @GetMapping("/page")
    public Page<User> userByPage(@RequestParam(name="page")int page, @RequestParam(name="size")int size){
    	Page<User> byPage = userPageService.getUserByPage(page, size);
    	return byPage;
    }
    
    @GetMapping("/pageandsort")
    public Page<User> userByPageAndSort(@RequestParam(name="page")int page, @RequestParam(name="size")int size){
    	Page<User> byPage = userPageService.getUserByPageAndSort(page, size);
    	return byPage;
    }
}
