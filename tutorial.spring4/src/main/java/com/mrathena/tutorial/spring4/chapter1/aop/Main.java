package com.mrathena.tutorial.spring4.chapter1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = ac.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = ac.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		demoMethodService.add();
		ac.close();
	}

}