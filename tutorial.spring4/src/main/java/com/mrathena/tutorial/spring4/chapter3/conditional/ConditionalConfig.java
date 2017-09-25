package com.mrathena.tutorial.spring4.chapter3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

	@Bean
	@Conditional(WindowsCondition.class) // 符合windows条件才实例化
	public ListService windowsListService() {
		return new WindowsListServiceImpl();
	}

	@Bean
	@Conditional(LinuxCondition.class) // 符合linux条件才实例化
	public ListService linuxListService() {
		return new LinuxListServiceImpl();
	}

}