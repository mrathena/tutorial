package com.mrathena.tutorial.spring4.chapter1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

	@Autowired
	FunctionService functionService;

	public String sayHello(String word) {
		System.out.println("UseFunctionService.sayHello");
		return functionService.sayHello(word);
	}

}