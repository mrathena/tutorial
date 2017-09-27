package com.mrathena.tutorial.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mrathena.tutorial.springmvc4.entity.DemoObject;

@Controller
public class ConverterController {

	// 指定返回的媒体类型为自定义的"application/mrathena"
	@RequestMapping(value = "convert", produces = { "application/mrathena" })
	public @ResponseBody DemoObject convert(@RequestBody DemoObject object) {
		return object;
	}

}