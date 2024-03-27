package com.serenity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SerenityEcommerceApplication {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("                                  -=-=-=-=-=-=-=-=-=-=-=-=- Application is starting -=-=-=-=-=-=-=-=-=-=-=-=-=-");
		SpringApplication.run(SerenityEcommerceApplication.class, args);
		System.out.println();
		System.out.println("                                 -=-=-=-=-=-=-=-=-=-=-=-=-=- Application is working fine -=-=-=-=-=-=-=-=-=-=-=-=-=-");
	
	}

}
