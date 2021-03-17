package com.defect.tracker.services;
import java.util.List;

import com.defect.tracker.data.entities.Login;


public interface LoginService {
	
	
	public List<Login> getLoginByStatus(String status);

	public void updateEmployeeStatus(String email, String status);
	
	public boolean isEmailAlreadyExist(String email);
	
	
}
