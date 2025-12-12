package com.rbu.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloblalExceptionHandler {

	@ExceptionHandler(UserIdNotFoundException.class)
	public String userNotFoundException(UserIdNotFoundException ex) {
		return ex.getMessage();
	}
}
