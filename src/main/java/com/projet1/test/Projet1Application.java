package com.projet1.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class Projet1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projet1Application.class, args);
	}

}
