package com.mrathena.tutorial.spring4.chapter2.perpost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	@PostConstruct// 在构造函数执行完之后执行
	public void init() {
		System.out.println("jsr250-init-method");
	}
	public JSR250WayService() {
		System.out.println("构造函数-JSR250WayService");
	}
	@PreDestroy// 在Bean销毁之前执行
	public void destory() {
		System.out.println("jsr250-destory-method");
	}
	
}