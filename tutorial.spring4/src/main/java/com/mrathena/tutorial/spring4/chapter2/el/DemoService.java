package com.mrathena.tutorial.spring4.chapter2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	@Value("其他")// 这里是注入普通字符串
	private String another;
	
	public String getAnother() {
		return another;
	}
	public void setAnother(String another) {
		this.another = another;
	}
	
}