package com.gsww.demo.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider-b")
public class ProviderController {
	@GetMapping("/sayHello")
	public String sayHello(){
		
		return "helloworld-b";
	}
	@GetMapping("/delete")
	public String delete(){
		return "delete success!----------";
	}
	
}
