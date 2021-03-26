package com.defect.tracker.services;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.defect.tracker.data.entities.Login;

public class LoginDetails implements UserDetails{
	
	private String userName;
	private String password;
	private String token;
	//private String status;
	
	public LoginDetails (Login user) {
		
		this.password = user.getPassword();
		this.userName = user.getEmail();
		this.token = user.getToken();
		//this.status = user.getStatus();
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getUsername() {
		return userName;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}


}
