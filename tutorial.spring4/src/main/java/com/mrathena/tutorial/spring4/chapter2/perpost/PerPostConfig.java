package com.mrathena.tutorial.spring4.chapter2.perpost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mrathena.spring4.tutorial.chapter2.perpost")
public class PerPostConfig {

	@Bean(initMethod = "init", destroyMethod = "destory")
	public BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean
	public JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
	
}