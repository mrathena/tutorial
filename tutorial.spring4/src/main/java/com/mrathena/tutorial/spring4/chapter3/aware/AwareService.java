package com.mrathena.tutorial.spring4.chapter3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@SuppressWarnings("deprecation")
	public void outputResult() {
		System.out.println("Bean名称: " + beanName);
		Resource resource = loader.getResource("classpath:com/mrathena/spring4/tutorial/chapter3/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载的内容为: " + IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}