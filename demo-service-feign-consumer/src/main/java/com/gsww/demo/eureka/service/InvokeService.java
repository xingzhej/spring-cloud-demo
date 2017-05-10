package com.gsww.demo.eureka.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="demo-service-provider",fallback=InvokeServiceHystrix.class)
public interface InvokeService {
	//getMapping：通过get方式请求FeiClient路径下的provider，sysHello方法
	@RequestMapping(value="/provider/sayHello", method=RequestMethod.GET)
	String invoke();

}
