package com.kenzie.capstoneproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.kenzie.capstoneproject.email.EmailService;
import com.kenzie.capstoneproject.repo.AddressRepository;
import com.kenzie.capstoneproject.repo.UserRepository;

@SpringBootApplication
public class CapstoneProjectApplication implements CommandLineRunner {
	@Autowired
	private EmailService service;
	

	public static void main(String[] args) {
		SpringApplication.run(CapstoneProjectApplication.class, args);
		System.out.println("this is a test");
	}
	
	@Override
	public void run(String... args) throws Exception {
		service.sendEMail("test@yahoo.com", "blahblahblah", "this is a message from the past");
	}

}
