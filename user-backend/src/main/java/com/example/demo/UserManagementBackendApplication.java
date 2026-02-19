package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementBackendApplication.class, args);
		System.out.println("running backend");
	}

}
