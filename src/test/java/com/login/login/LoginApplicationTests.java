package com.login.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LoginApplication.class)  // ✅ Ensure Spring Boot finds the main class
class LoginApplicationTests {

	@Test
	void contextLoads() {
	}
}
