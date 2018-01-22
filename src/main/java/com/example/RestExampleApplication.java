package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.common.JpaConfiguration;

@SpringBootApplication
@Import(JpaConfiguration.class)
public class RestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExampleApplication.class, args);
	}
}
