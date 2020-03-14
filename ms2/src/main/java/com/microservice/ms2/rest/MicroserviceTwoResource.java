package com.microservice.ms2.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MicroserviceTwoResource {

	
	@GetMapping
	public ResponseEntity<String> getMicroserviceTwoData() {
		
		return ResponseEntity
				.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body("Hello, I'm Microservice Two !");
	}
}
