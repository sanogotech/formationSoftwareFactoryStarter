package com.frontbackend.thymeleaf.bootstrap.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class HelloControllerWebTest {
	
	@Autowired
	private MockMvc mockMvc;

	/*
	@MockBean
	private GreetingService service;
	*/

	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		//when(service.greet()).thenReturn("Hello, Mock");
		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Mock")));
	}

}
