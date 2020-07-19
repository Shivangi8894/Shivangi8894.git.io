package com.example.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.model")
public class CompanyRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyRecordsApplication.class, args);
	}

}
