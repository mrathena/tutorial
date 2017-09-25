package com.mrathena.tutorial.spring4.chapter3.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {

	@Bean
	@Profile("development")
	public TestBean devTestBean() {
		return new TestBean("Development TestBean");
	}

	@Bean
	@Profile("production")
	public TestBean proTestBean() {
		return new TestBean("Production TestBean");
	}

}