package com.mrathena.tutorial.springmvc4.config.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DemoInterceptor extends HandlerInterceptorAdapter {

	private String KEY_REQUEST_START_TIME = "requestStartTime";

	// 在请求发生前执行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long requestStartTime = System.currentTimeMillis();
		request.setAttribute(KEY_REQUEST_START_TIME, requestStartTime);
		return true;
	}

	// 在请求完成后执行
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv)
			throws Exception {
		long requestStartTime = (long) request.getAttribute(KEY_REQUEST_START_TIME);
		request.removeAttribute(KEY_REQUEST_START_TIME);
		long requestEndTime = System.currentTimeMillis();
		System.out.println("本次请求处理时间: " + (requestEndTime - requestStartTime) + "ms");
	}

}