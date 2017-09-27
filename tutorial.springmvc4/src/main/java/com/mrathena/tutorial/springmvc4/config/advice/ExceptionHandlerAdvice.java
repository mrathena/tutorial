package com.mrathena.tutorial.springmvc4.config.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice // 控制器建言
public class ExceptionHandlerAdvice {

	@ExceptionHandler(value = Exception.class) // 全局, 拦截所有的exception
	public String exception(Exception exception, WebRequest request, Model model) {
		model.addAttribute("error", exception.getMessage());
		return "error";
	}

	@ModelAttribute // 将键值对添加到全局, 所有使用@RequestMapping的方法都可以获得该键值对
	public void addAttribute(Model model) {
		model.addAttribute("msg", "This is a extra message");
	}

	@InitBinder // 定制WebDataBinder, 此处演示忽略request参数的id
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields("id");
	}

}