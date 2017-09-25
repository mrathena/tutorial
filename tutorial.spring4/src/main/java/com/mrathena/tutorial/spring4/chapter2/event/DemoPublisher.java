package com.mrathena.tutorial.spring4.chapter2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	
	@Autowired
	private ApplicationContext ac;// 注入ApplicationContext用来发布事件
	
	public void publish(String msg) {
		ac.publishEvent(new DemoEvent(this, msg));// 发布事件
	}

}