package com.example.demo;

public class User {
	private String userEmail;
	private String userPassword;
	
	public User(){
		
	}
	
	public User(String email, String password){
		setUserEmail(email);
		setUserPassword(password);
	}
	
	public String getUserEmail(){
		return userEmail;
	}
	
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	
	public String getUserPassword(){
		return userPassword;
	}
	
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
}
