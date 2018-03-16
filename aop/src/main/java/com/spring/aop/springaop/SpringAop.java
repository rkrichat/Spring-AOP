package com.spring.aop.springaop;

public class SpringAop {
	
	public void before() {
		System.out.println("--->>Before run business logic");
	}
	
	public void after() {
		System.out.println("--->>After run business logic");
	}
	
	public void around() {
		System.out.println("---> Work around");
	}
	
	public void afterThrowing(Throwable ex) {
		System.out.println("--->After throwing" + ex);
	}
	
	public void afterReturninig(Object resultObj) {
		System.out.println("--->after returning" + resultObj);
	}
}
