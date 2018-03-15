package com.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectJ {
		
	@Before("execution(* *(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Before run business -->>");
	}
	
	@After("execution(* *(..))")
	public void after() {
		
	}
	
	@Around("execution(* *(..))")
	public void around() {
		
	}
	
	@AfterReturning("execution(* *(..))")
	public void afterReturning() {
		
	}
	
	@AfterThrowing("execution(* *(..))")
	public void afterThrowing() {
		
	}
}
