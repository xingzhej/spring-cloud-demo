package com.gsww.demo.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider-c")
public class ProviderController {
	@GetMapping("/sayHello")
	public String sayHello(){
		
		return "helloworld-c";
	}
	
}
