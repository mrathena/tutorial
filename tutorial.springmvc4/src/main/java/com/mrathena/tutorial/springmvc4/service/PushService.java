package com.mrathena.tutorial.springmvc4.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

@Service
public class PushService {

	private DeferredResult<String> deferredResult;
	
	public DeferredResult<String> getAsyncUpdate() {
		deferredResult = new DeferredResult<>();
		return deferredResult;
	}
	
	@Scheduled(fixedDelay = 3000)
	public void refersh() {
		if (deferredResult != null) {
			// 定时更新deferredresult
			deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
		}
	}
	
}