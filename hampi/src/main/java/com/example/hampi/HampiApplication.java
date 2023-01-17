package com.example.hampi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HampiApplication {

	public static void main(String[] args) {
		System.out.println("main app start");
		SpringApplication.run(HampiApplication.class, args);
		System.out.println("main app ends");
	}

}
