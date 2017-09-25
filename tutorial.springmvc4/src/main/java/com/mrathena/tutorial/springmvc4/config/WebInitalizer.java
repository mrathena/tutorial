package com.mrathena.tutorial.springmvc4.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitalizer implements WebApplicationInitializer {
	// WebApplicationInitializer是Spring提供用来配置Servlet3.0+配置的接口, 从而实现了替代web.xml, 
	// 实现此接口会自动被SpringServletContainerInitializer(用来启动Servlet3.0容器)获取到

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// 新建WebApplicationContext
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		// 注册配置类
		context.register(SpringMvcConfig.class);
		// 将其与当前ServletContext关联
		context.setServletContext(servletContext); 
		// 注册SpringMVC的DispatcherServlet
//		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		Dynamic servlet = servletContext.addServlet("spring-mvc", new DispatcherServlet(context));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}