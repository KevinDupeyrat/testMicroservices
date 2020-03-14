package com.microservice.ms1.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MicroserviceOneResource {
	
	
	@GetMapping
	public ResponseEntity<String> getMicroserviceOneData() {
		
		return ResponseEntity
				.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body("Hello, I'm Microservice One !");
	}

}
