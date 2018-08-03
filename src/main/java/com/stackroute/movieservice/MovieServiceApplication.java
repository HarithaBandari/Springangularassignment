package com.stackroute.movieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class MovieServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MovieServiceApplication.class, args);
	}
}