package com.example.client.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-ms2")
@RibbonClient(name = "microservice-ms2")
public interface MicroserviceTwoProxy {
	
	@GetMapping
	String callMicroserviceTwo();

}
