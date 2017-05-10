package com.gsww.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.gsww.demo.zuul.filter.AccessFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DemoZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoZuulGatewayApplication.class, args);
	}
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}
