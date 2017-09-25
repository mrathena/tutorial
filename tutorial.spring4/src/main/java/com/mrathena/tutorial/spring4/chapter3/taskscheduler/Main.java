package com.mrathena.tutorial.spring4.chapter3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		try {
			Thread.sleep(1000 * 60);
		} catch (Exception e) {
			e.printStackTrace();
		}
		context.close();
	}

}