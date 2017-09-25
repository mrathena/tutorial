package com.mrathena.tutorial.spring4.chapter3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		ListService listService = context.getBean(ListService.class);
		System.out.println(listService.showListCmd());
		context.close();
	}

}