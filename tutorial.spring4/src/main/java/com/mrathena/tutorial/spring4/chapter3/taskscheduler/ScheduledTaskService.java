package com.mrathena.tutorial.spring4.chapter3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 1000) // 每1000毫秒执行一次
	public void reportCurrentTime() {
		System.out.println("now: " + sdf.format(new Date()));
	}

	@Scheduled(cron = "0 36 10 ? * *") // 每天10:36执行一次
	public void fixTimeExecution() {
		System.out.println("执行时间: " + sdf.format(new Date()));
	}

}