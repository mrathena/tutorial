package com.mrathena.tutorial.spring4.chapter3.taskasync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	// @Async注解表明该方法是个异步方法, 如果注解在类级别, 则该类所有方法都是异步方法, 这些方法会被自动注入到TaskExecutor
	
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("1: " + i);
	}
	
	@Async
	public void executeAsyncTask2(Integer i) {
		System.out.println("2: " + i);
	}
	
}