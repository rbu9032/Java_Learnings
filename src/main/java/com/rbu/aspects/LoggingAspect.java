package com.rbu.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

	/*
	 * @Before("execution(* com.rbu.service.UserService.save(..))") public void
	 * saveUserLog() { log.info("Entered into save User method"); }
	 * 
	 * @After("execution(* com.rbu.service.UserService.save(..))") public void
	 * afterSaveUserLog() { log.info("Returning from save user method"); }
	 * 
	 * @Around("execution(* com.rbu.service.UserService.getUser(..))") public User
	 * beforegetUserLog(ProceedingJoinPoint joinpoint) throws Throwable {
	 * log.info("Entered getUser method"); Object result = joinpoint.proceed();
	 * log.info("Returning from getUser method"); return (User)result; }
	 */
	@Around("execution(* com.rbu.service.UserService.*(..))")
	public Object logEntryAndExit(ProceedingJoinPoint joinpoint)throws Throwable {
		log.info("Entered method: {}", joinpoint.getSignature().getName());
		Object result = joinpoint.proceed();
		log.info("Returning method {}", joinpoint.getSignature().getName());
		return result;
	}
	@AfterThrowing("execution(* com.rbu.service.UserService.getUser(..))")
	public void userNotFoundLog() {
		log.error("User Id not found");
	}
	
	@AfterReturning("execution(* com.rbu.service.UserService.getUser(..))")
	public void getUserExit() {
		log.error("Returning from getUser method. AfterReturning will only work if the method is sccessful");
	}
}
