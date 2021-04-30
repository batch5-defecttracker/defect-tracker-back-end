package com.defect.tracker.customservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;
import com.defect.tracker.services.LoginService;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	LoginService loginService;

	@Override
	public UserDetails loadUserByUsername(String email) {
		if (!loginService.isEmailAlreadyExist(email)) {
			return null;
		}
		System.out.println("load by user name");
		Login employee = loginService.findByEmail(email);
		CustomUserDetails userDetails = new CustomUserDetails();
		userDetails.setUser(employee);
	
		return userDetails;
	}
}
