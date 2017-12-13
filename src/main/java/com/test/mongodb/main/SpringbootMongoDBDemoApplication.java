package com.test.mongodb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.test.mongodb.service.EmployeeController;

@SpringBootApplication
@ComponentScan({"com.test.mongodb.domain"})
@EnableMongoRepositories ("com.test.mongodb.repository")
@ComponentScan(basePackageClasses = EmployeeController.class)
public class SpringbootMongoDBDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoDBDemoApplication.class, args);
	}
}
