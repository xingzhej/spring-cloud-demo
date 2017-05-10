package com.gsww.demo.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/config-client")
public class DemoConfigController {
	@Value("${from}")
	private String from;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@GetMapping("/get-config")
	public String getConfig(){
		System.out.println(this.from);
		return "config-client-demo-example";
	}
	
}
