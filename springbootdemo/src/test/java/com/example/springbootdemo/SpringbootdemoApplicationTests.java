package com.example.springbootdemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

	private MockMvc mvc;

	@Autowired
	private WebApplicationContext context;

	@Before
	public  void befor(){
		this.mvc = MockMvcBuilders.webAppContextSetup(context).build();

	}
	@Test
	public void contextLoads() throws Exception{
		RequestBuilder req = get("/Hello");
		mvc.perform(req).andExpect(status().isOk()).andExpect(content().string("hello,this is a springboot demo"));
	}

}
