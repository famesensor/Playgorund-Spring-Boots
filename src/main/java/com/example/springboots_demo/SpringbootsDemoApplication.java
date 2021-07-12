package com.example.springboots_demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsDemoApplication.class, args);
	}

	@GetMapping
	public List<String> hello() {
		return List.of("Hey kid", "It's fucking your nightmare");
	}
}
