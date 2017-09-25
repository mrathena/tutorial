package com.mrathena.tutorial.spring4.chapter2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("DemoBean - dev");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		return new DemoBean("DemoBean - prod");
	}
	
}