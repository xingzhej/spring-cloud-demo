package com.gsww.demo.eureka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class InvokeService {
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="invokeServiceFallback")
	public String invokeMethod(){
		System.out.println("-------------------------------------");
		return restTemplate.getForEntity("http://DEMO-SERVICE-PROVIDER/provider/sayHello", String.class).getBody();
	}
	public String invokeServiceFallback(){
		return "error";
	}

}
