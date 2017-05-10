package com.gsww.demo.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsww.demo.eureka.service.InvokeService;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
	@Autowired
	InvokeService invokeService;
	@GetMapping("invoke")
	public String invoke(){
		System.out.println("-------------------------------------");
		return invokeService.invokeMethod();
	}

}
