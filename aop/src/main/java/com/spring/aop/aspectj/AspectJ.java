package com.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectJ {
		
	@Before("execution(* *(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Before run business -->>");
	}
}
