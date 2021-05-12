package com.defect.tracker.data.entities;

public class LoginResponce {
	private final String jwt;

	
	public LoginResponce(String jwt) {
		this.jwt = jwt;
	}


	public String getJwt() {
		return jwt;
	}
	
}
