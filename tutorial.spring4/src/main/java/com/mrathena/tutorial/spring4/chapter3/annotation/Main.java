package com.mrathena.tutorial.spring4.chapter3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		DemoService service = context.getBean(DemoService.class);
		service.outputResult();
		context.close();
	}

}