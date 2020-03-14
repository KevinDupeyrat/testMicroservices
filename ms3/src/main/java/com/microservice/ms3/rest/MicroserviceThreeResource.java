package com.microservice.ms3.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MicroserviceThreeResource {

	@GetMapping
	public ResponseEntity<String> getMicroserviceThreeData() {
		
		return ResponseEntity
				.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body("Hello, I'm Microservice Three !");
	}
}
