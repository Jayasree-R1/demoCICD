package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCicdApplication.class, args);
	}
	
	public String greet() {
        return "Hello, CI/CD Pipeline!";
    }

}
