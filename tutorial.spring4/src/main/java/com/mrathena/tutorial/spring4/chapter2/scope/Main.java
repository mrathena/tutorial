package com.mrathena.tutorial.spring4.chapter2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletonService singleton1 = ac.getBean(DemoSingletonService.class);
		DemoSingletonService singleton2 = ac.getBean(DemoSingletonService.class);
		DemoPrototypeService prototype1 = ac.getBean(DemoPrototypeService.class);
		DemoPrototypeService prototype2 = ac.getBean(DemoPrototypeService.class);
		System.out.println(singleton1 == singleton2);
		System.out.println(prototype1 == prototype2);
		ac.close();
	}

}