package com.kenzie.capstoneproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapstoneProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(CapstoneProjectApplication.class, args);
		System.out.println("the program is ready");
	}
}


//@SpringBootApplication
//public class CapstoneProjectApplication implements CommandLineRunner {
//	@Autowired
//	private EmailService service;
//	
//
//	public static void main(String[] args) {
//		SpringApplication.run(CapstoneProjectApplication.class, args);
//		System.out.println("the program is ready");
//	}
//	
//	@Override
//	public void run(String... args) throws Exception {
//		service.sendEMail("Kenzie","userman@yahoo.com", "Welcome", "Thank you for registering.");
//	}
//
//}