package com.rbu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.model.Employee;

@RestController
public class DBController {
	
	 @Autowired
	    JdbcTemplate jdbcTemplate;

//	    @GetMapping("/save")
//	    public String save(){
//	        jdbcTemplate.update("insert into employee values(?,?,?)",11,"ddd","ddd@gmail.com");
//	        return "Saved";
//	    }
	    @GetMapping("/emp")
	    public void getEmployee() {
	    Employee employee =jdbcTemplate.queryForObject("select * from employee where empId=8", 
                (rs, n)-> new Employee(rs.getInt(1), rs.getString(2),rs.getString(3)));
	    	System.out.println(employee);
	    }

}
