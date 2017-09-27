package com.mrathena.tutorial.springmvc4.config.httpMessageConverter;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import com.mrathena.tutorial.springmvc4.entity.DemoObject;

// 继承AbstractHttpMessageConverter来实现自定义的消息转换器
public class DemoHttpMessageConverter extends AbstractHttpMessageConverter<DemoObject> {

	// 新建一个我们自定义的媒体类型"application/merathena"
	public DemoHttpMessageConverter() {
		super(new MediaType("application", "mrathena", Charset.forName("UTF-8")));
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		// 表名该消息转换器只处理DemoObject类型
		return DemoObject.class.isAssignableFrom(clazz);
	}

	@Override
	protected DemoObject readInternal(Class<? extends DemoObject> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		// 处理请求数据(@RequestBody注解的DemoObject类型的参数)
		String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
		String tempArr[] = temp.split("-");
		return new DemoObject(new Integer(tempArr[0]), tempArr[1]);
	}

	@Override
	protected void writeInternal(DemoObject object, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// 处理响应数据(@ResponseBody注解的DemoObject类型的返回值)
		String out = "Hello: " + object.getId() + "-" + object.getUsername();
		outputMessage.getBody().write(out.getBytes());
	}

}
