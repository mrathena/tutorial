package com.mrathena.tutorial.spring4.chapter3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void outputResult() {
		System.out.println("组合注解也可以获得Bean");
	}

}