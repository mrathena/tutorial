package com.mrathena.tutorial.spring4.chapter1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name = "add操作")
	public void add() {
		System.out.println("DemoAnnotationService.add");
	}

}