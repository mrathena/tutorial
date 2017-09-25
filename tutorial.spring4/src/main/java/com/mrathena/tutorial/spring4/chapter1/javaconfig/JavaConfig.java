package com.mrathena.tutorial.spring4.chapter1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}

	// 方式1
	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
	// 方式2
//	@Bean
//	public UseFunctionService useFunctionService2(FunctionService functionService) {
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}

}