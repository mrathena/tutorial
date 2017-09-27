package com.mrathena.tutorial.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdviceController {

	@RequestMapping("advice")
	public String getSomething(@ModelAttribute("msg") String msg) {
		throw new IllegalArgumentException("参数有误. @ModelAttribute:msg: " + msg);
	}
	
}