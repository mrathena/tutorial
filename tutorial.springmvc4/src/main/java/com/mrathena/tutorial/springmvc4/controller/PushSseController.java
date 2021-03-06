package com.mrathena.tutorial.springmvc4.controller;

import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PushSseController {

	/*
	 * 推送方案: 当客户端向服务端发送请求, 服务端会抓住这个请求不放, 等有数据更新的时候才返回给客户端, 当客户端接收到消息后,
	 * 再向服务端发送请求, 周而复始(感觉就和长连接差不多)
	 * 
	 * 1.基于SSE(Server Send Event 服务端发送事件)的服务端推送, 需要新式浏览器的支持
	 * 2.基于Server3.0+的异步方法特性, 跨浏览器
	 */

	// 输出媒体类型为"text/event-stream", 这是服务端SSE的支持
	@RequestMapping(value = "push", produces = "text/event-stream;charset=UTF-8")
	public @ResponseBody String push(HttpServletResponse response) {
		Random random = new Random();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "event:message\ndata:你猜 " + random.nextInt() + "\n\n";
	}

}