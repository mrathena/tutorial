package com.mrathena.tutorial.spring4.chapter1.javaconfig;

public class UseFunctionService {

	FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public String sayHello(String word) {
		System.out.println("UseFunctionService.sayHello");
		return functionService.sayHello(word);
	}

}