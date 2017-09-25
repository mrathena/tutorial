package com.mrathena.tutorial.spring4.chapter1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = ac.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("java config"));
		ac.close();
	}
	
}