package com.mrathena.tutorial.spring4.chapter2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		ELConfig resourceService = context.getBean(ELConfig.class);
		resourceService.outputResource();
		context.close();
	}
	
}