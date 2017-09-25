package com.mrathena.tutorial.spring4.chapter2.perpost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PerPostConfig.class);
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		context.close();
	}
	
}