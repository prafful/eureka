package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

	@RequestMapping("/hello")
	public Friend sayHello() {
		//return "Hello";
		Friend f = new Friend();
		f.setName("Nano");
		f.setLocation("Ahmedabad");
		f.setYear(8);
		
		return f;
		
		
	}
	
}
