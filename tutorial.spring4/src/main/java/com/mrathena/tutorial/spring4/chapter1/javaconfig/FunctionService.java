package com.mrathena.tutorial.spring4.chapter1.javaconfig;

public class FunctionService {

	public String sayHello(String word) {
		System.out.println("FunctionService.sayHello");
		return "Hello " + word;
	}
	
}