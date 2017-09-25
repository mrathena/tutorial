package com.mrathena.tutorial.spring4.chapter1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.mrathena.spring4.tutorial.chapter1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}