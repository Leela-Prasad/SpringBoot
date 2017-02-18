package com.springboot;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	public void wish() {
		System.out.println("Hello Spring Boot Application!");
	}
}
