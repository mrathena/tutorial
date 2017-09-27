package com.mrathena.tutorial.springmvc4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.mrathena.tutorial.springmvc4.config.interceptor.DemoInterceptor;

@Configuration
@EnableWebMvc // 开启SpringMVC支持, 没有此代码, 重写WebMvcConfigurerAdapter方法无效
@ComponentScan("com.mrathena.tutorial.springmvc4")
// 自定义配置需要继承WebMvcConfigurerAdapter类或实现WebMvcConfigurer接口, 两者选一, 具体功能参照API
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		// 视图解析器
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/classes/view/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 注册静态资源处理器
		// addResourceHandler指的是对外暴露的访问路径, addResourceLocations指的是文件的存放路径
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/view/static/");
	}

	public void addInterceptors(InterceptorRegistry registry) {
		// 注册拦截器
		registry.addInterceptor(new DemoInterceptor());
	}
	
	public void addViewControllers(ViewControllerRegistry registry) {
		// 纯页面转向(就是不操作Model的页面跳转Controller)可以直接写在这里, 代码更简洁, 更集中
		// addViewController就是绑定uri, setViewName就是返回的view名称
		registry.addViewController("index2").setViewName("index");
		registry.addViewController("index3").setViewName("index");
		registry.addViewController("index4").setViewName("index");
		// addRedirectViewController访问index5, 会让浏览器重新访问index
		registry.addRedirectViewController("index5", "index");
	}

}