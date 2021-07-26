package com.example.spring.basics.springin5step;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepApplication {



	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm()); // new QuickSortAlgorithm

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepApplication.class, args);
		BinarySearchImpl binarySearch =	applicationContext.getBean(BinarySearchImpl.class);

		int res = binarySearch.binarySearch(new int[]{12, 4}, 4);
		System.out.println(res );
	}

}
