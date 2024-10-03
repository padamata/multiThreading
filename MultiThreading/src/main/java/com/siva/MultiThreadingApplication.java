package com.siva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootConfiguration
@SpringBootApplication
@EnableJpaRepositories
public class MultiThreadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiThreadingApplication.class, args);
	}

}
