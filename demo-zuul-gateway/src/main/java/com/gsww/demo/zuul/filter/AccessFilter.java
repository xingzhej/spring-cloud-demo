package com.gsww.demo.zuul.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.zuul.ZuulFilter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.context.RequestContext;
public class AccessFilter extends ZuulFilter{
	private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
	@Override
	public Object run() {
		RequestContext context  = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		String requestUrl=request.getRequestURL().toString();
		if(requestUrl.contains("delete")){
			System.out.println("delete is not allowed");
			context.setSendZuulResponse(false);//过滤掉delete请求，不进行路由
			context.setResponseStatusCode(401);
			context.setResponseBody("{\"result\":\"delete is not allowed!\"}");
			context.set("isSuccess", false);  
		}else{
			System.out.println("operate is allowed-------------!!!");
			context.setSendZuulResponse(true);//过滤掉delete请求，不进行路由
			context.setResponseStatusCode(200);
			context.set("isSuccess", true);  
		}
        return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}
	@Override
	public String filterType() {
		return "pre";
	}
}
