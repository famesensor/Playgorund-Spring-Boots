package com.example.springboots_demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.springboots_demo.student.Student;
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

}
