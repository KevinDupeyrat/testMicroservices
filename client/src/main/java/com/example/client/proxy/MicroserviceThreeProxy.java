package com.example.client.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-ms3")
@RibbonClient(name = "microservice-ms3")
public interface MicroserviceThreeProxy {
	
	@GetMapping
	String callMicroserviceThree();

}
