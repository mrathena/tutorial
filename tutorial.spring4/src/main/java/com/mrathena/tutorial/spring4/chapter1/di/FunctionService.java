package com.mrathena.tutorial.spring4.chapter1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

	public String sayHello(String word) {
		System.out.println("FunctionService.sayHello");
		return "Hello " + word;
	}
	
}