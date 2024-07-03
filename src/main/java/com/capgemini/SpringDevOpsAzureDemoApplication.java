package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDevOpsAzureDemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Welcome the spring boot application in Azure through GitHub";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDevOpsAzureDemoApplication.class, args);
	}

}
