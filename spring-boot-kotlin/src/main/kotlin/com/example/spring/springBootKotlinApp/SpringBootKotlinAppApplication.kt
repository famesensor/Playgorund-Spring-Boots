package com.example.spring.springBootKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinAppApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinAppApplication>(*args)
}
