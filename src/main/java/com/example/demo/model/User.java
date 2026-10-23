package com.example.demo.model;

import java.util.*;

public class User {

	private UUID UUID;
	private String username;
	private String email;
	private int age;
	
	public User() {
		
	}

	public User(UUID uUID, String username, String email, int age) {
		super();
		UUID = uUID;
		this.username = username;
		this.email = email;
		this.age = age;
	}

	public UUID getUUID() {
		return UUID;
	}

	public void setUUID(UUID uUID) {
		UUID = uUID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}