package com.rbu.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {
		String pass1 = passwordEncoder().encode("1218");
		String pass2 = passwordEncoder().encode("1218");
		System.out.println(pass1);
		System.out.println(pass2);
		UserDetails user1 = User.builder()
				            .username("Ram")
				            .password(pass1)
				            .build();
		UserDetails user2 = User.builder()
	            .username("Sita")
	            .password(pass2)
	            .build();
		return new InMemoryUserDetailsManager(user1,user2);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) {
		
		return http.
		     authorizeHttpRequests(authorize -> 
		                             authorize
		                            .requestMatchers("/hi","/bye")
		                            .authenticated()
		                            .requestMatchers("/open")
		                            .permitAll()
		                            .requestMatchers("/noaccess")
		                            .denyAll())
		     .formLogin(Customizer.withDefaults())
		     .httpBasic(Customizer.withDefaults())
		     .build();
		// or // return http.build();
		
	}
}
