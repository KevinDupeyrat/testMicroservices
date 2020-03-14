package com.example.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.client.service.CallMicroserviceService;

@Controller
public class ClientResource {
	
	@Autowired
	private CallMicroserviceService callMicroserviceService;
	
	
	@GetMapping("/one")
	public String getMicroserviceOne() {
		return callMicroserviceService.callMicroserviceOne();
	}
	

	@GetMapping("/two")
	public String getMicroserviceTwo() {
		return callMicroserviceService.callMicroserviceTwo();
	}
	
	
	@GetMapping("/three")
	public String getMicroserviceThree() {
		return callMicroserviceService.callMicroserviceThree();
	}

}
