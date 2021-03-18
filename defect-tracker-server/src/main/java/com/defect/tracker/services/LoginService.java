package com.defect.tracker.services;
import java.util.List;

import com.defect.tracker.data.entities.Login;


public interface LoginService {
	
	public List<Login> getEmployee(String status);

	public String forgotPassword(String email);

	public String resetPassword(String token, String password);

	
	public List<Login> getLoginByStatus(String status);

	public void updateEmployeeStatus(String email, String status);
	
	public boolean isEmailAlreadyExist(String email);
	
	
}
