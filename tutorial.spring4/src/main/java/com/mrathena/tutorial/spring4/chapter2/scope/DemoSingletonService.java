package com.mrathena.tutorial.spring4.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")// 默认的scope就是singleton
public class DemoSingletonService {

}