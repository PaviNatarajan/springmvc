package com.springboot.first.controller;

public class user_data {
	private String email;
	private String name;
	
	public user_data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user_data(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
