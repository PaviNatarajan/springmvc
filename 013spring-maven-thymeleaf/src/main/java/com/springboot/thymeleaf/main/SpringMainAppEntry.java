package com.springboot.thymeleaf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"com.spring.main.controller"})
public class SpringMainAppEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringMainAppEntry.class, args);
	}

}