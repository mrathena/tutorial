package com.mrathena.tutorial.spring4.chapter2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher publisher = context.getBean(DemoPublisher.class);
		publisher.publish("第一条消息");
		context.close();
	}
	
}