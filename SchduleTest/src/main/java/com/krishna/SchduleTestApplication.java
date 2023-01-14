package com.krishna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchduleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchduleTestApplication.class, args);
		System.out.println("Spring test");
		
	}

}
