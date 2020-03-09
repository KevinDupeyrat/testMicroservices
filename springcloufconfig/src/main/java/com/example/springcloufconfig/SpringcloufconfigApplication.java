package com.example.springcloufconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringcloufconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloufconfigApplication.class, args);
	}

}
