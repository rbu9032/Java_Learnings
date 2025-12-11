package com.rbu.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix="spring.info")  // you can use this annotation to read data from properties file instead of @Component in model class
public class Props {
	
	//@Value("${spring.info.name}")
	public String name;
	
	//@Value("${spring.info.password}")
	public String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
