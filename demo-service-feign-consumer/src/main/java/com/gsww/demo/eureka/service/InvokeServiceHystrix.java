package com.gsww.demo.eureka.service;

import org.springframework.stereotype.Component;

@Component
public class InvokeServiceHystrix implements InvokeService {

	@Override
	public String invoke() {
		System.out.println("---------------这里是断路器处理业务-------------");
		return "error";
	}

}
