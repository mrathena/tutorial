package com.mrathena.tutorial.springmvc4;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.mrathena.tutorial.springmvc4.config.SpringMvcConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringMvcConfig.class)
@WebAppConfiguration("src/main/resources")
public class Mrathean {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;
	@SuppressWarnings("unused")
	@Autowired
	private MockHttpSession Session;
	@SuppressWarnings("unused")
	@Autowired
	private MockHttpServletRequest request;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();// 模拟MVC对象
	}

	@Test
	public void testNormalController() throws Exception {
		mockMvc.perform(get("/normal")) // 模拟向"/normal"发起get请求, 必须得有"/"
			.andExpect(status().isOk()) // 预期返回状态为200
			.andExpect(view().name("normal")) // 预期view的名称为"page"
			.andExpect(forwardedUrl("/WEB-INF/classes/view/normal.jsp")) // 预期页面转向的真正路径为 ...../normal.jsp
			.andExpect(model().attribute("message", "你猜"));// 预期model里面msg的值为"你猜"
	}
	
	@Test
	public void testRestController() throws Exception {
		mockMvc.perform(get("/rest")) // 模拟向"/rest"发起get请求
			.andExpect(status().isOk()) // 预期返回状态为200
			.andExpect(content().contentType("text/plain;charset=UTF-8")) // 预期返回值的媒体类型为"..."
			.andExpect(content().string("你猜")); // 预期返回值的内容为"你猜"
	}

}