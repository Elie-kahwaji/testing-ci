package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		Assert.assertNotNull("TestController not initiated", helloController);
	}

}
