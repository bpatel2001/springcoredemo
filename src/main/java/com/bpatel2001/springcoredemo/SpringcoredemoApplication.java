package com.bpatel2001.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tell Spring Boot where to scan by using scanBasePackages in the SpringBootApplication annotation
//@SpringBootApplication(
//		scanBasePackages = {"com.bpatel2001.springcoredemo",
//							"com.bpatel2001.util"}
//)
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
