package com.example.client.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-ms1")
@RibbonClient(name = "microservice-ms1")
public interface MicroserviceOneProxy {
	
	@GetMapping
	String callMicroserviceOne();

}
