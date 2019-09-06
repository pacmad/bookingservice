package com.diwakar.booking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BookingApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BookingApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(BookingApplication.class, args);
	}

}
