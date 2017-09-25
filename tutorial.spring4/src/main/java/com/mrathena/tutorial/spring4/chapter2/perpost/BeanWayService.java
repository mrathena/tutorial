package com.mrathena.tutorial.spring4.chapter2.perpost;

public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-method");
	}
	public BeanWayService() {
		System.out.println("构造函数-BwanWayService");
	}
	public void destory() {
		System.out.println("@Bean-destory-method");
	}
	
}