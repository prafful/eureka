package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumerControllerClient {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	public void getFriend() {
		
		List<ServiceInstance> instances=discoveryClient.getInstances("friend-producer");
		ServiceInstance serviceInstance=instances.get(0);
		
		String baseUrl=serviceInstance.getUri().toString();
		
		baseUrl=baseUrl+"/hello";
		System.out.println("BaseURL: "+ baseUrl);

	
		//String baseUrl = "http://localhost:8881/hello";
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = null;
		
		response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		
		
		
		
	}

	private HttpEntity<?> getHeaders() {
		// TODO Auto-generated method stub
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
	
	
}
