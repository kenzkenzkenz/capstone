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
		System.out.println("the program is ready");
	}
	
	@Override
	public void run(String... args) throws Exception {
		service.sendEMail("Kenzie","userman@yahoo.com", "Welcome", "Thank you for registering.");
	}

}
