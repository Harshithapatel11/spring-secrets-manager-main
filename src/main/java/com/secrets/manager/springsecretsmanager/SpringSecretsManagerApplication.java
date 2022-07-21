package com.secrets.manager.springsecretsmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecretsManagerApplication {

	@GetMapping("/")
	public String hello() {
		return "Hiii";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecretsManagerApplication.class, args);
	}

}
