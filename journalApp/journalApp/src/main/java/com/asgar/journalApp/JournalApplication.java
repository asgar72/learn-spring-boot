package com.asgar.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.asgar.journalApp.Repository")
public class JournalApplication {
	public static void main(String[] args) {
		SpringApplication.run(JournalApplication.class, args);
	}
}
