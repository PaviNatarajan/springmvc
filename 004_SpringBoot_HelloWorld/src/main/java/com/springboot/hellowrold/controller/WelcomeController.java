package com.springboot.hellowrold.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/snacks")
 public String welcome()
	{
	 return "Go and have a cake!!!";
 }
	}
