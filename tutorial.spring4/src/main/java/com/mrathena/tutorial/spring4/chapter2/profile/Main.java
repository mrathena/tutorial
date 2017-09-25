package com.mrathena.tutorial.spring4.chapter2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();// 没有注册Bean配置类
		context.getEnvironment().setActiveProfiles("dev");
//		context.getEnvironment().setActiveProfiles("prod");
		context.register(ProfileConfig.class);// 后置注册Bean配置类, 不然会报Bean未定义错误
		context.refresh();
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());
		context.close();
	}
	
}