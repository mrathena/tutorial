package com.mrathena.tutorial.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {

	@RequestMapping("normal")
	public String normal(Model model) {
		model.addAttribute("message", "你猜");
		return "normal";
	}
	
}