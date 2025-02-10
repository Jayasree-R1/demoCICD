package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoCicdApplicationTests {

	@Test
	void testGreet() {
		DemoCicdApplication app = new DemoCicdApplication();
        assertEquals("Hello, CI/CD Pipeline!", app.greet());
	}

}
