package com.mrathena.tutorial.spring4.chapter1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = ac.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("di"));
		ac.close();
	}

}