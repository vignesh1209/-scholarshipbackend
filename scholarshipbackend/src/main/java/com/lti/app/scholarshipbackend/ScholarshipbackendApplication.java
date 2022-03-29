package com.lti.app.scholarshipbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lti.app.scholarshipbackend.controller"+
"com.lti.app.scholarshipbackend.dao"+"com.lti.app.scholarshipbackend.beans"+
		"com.lti.app.scholarshipbackend.exception"+"com.lti.app.scholarshipbackend.service"})
public class ScholarshipbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScholarshipbackendApplication.class, args);
		System.out.println("hi");
	}

}
