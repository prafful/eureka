package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		ConsumerControllerClient ccc = ctx.getBean(ConsumerControllerClient.class);
		ccc.getFriend();
	}
	
	@Bean
	public ConsumerControllerClient ccc() {
		return new ConsumerControllerClient();
	}
}
