package com.mrathena.tutorial.springmvc4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	// SpringMVC默认是"text/plain;charset=ISO-8859-1"
	@RequestMapping(value = "rest", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String normal() {
		return "你猜";
	}
	
}