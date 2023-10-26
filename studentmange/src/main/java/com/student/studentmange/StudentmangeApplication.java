package com.student.studentmange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// @PropertySource("classpath:auth0.properties")
public class StudentmangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmangeApplication.class, args);
	}

}
