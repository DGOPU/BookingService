package com.upgrad.BookingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.ws.rs.core.Application;

@SpringBootApplication
public class BookingServiceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BookingServiceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();}


}
