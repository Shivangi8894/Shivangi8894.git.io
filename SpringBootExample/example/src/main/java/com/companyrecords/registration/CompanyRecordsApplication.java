package com.companyrecords.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CompanyRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyRecordsApplication.class, args);
	}

}
