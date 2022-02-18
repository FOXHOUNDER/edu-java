package com.unimib.labprog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FycApplication {
	public static void main(String[] args) {
		SpringApplication.run(FycApplication.class, args);
	}
}
