package com.mrathena.tutorial.spring4.chapter3.taskasync;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskAsyncConfig.class);
		AsyncTaskService service = context.getBean(AsyncTaskService.class);
		for (int i = 0; i < 10; i++) {
			service.executeAsyncTask(i);
			service.executeAsyncTask2(i);
		}
		context.close();
		System.out.println("执行完了---------------------");
	}

}