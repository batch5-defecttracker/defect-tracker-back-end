package com.defect.tracker.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;


public interface LoginService {
	
	public List<Login> getEmployee(String status);

	public String forgotPassword(String email);

	public String resetPassword(String token, String password);

	

}
