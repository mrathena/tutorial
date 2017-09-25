package com.mrathena.tutorial.spring4.chapter3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.mrathena.spring4.tutorial.chapter3.taskscheduler")
@EnableScheduling // 开启计划任务支持
public class TaskSchedulerConfig {

}