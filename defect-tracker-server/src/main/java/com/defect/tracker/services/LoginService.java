package com.defect.tracker.services;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;

@Service
public interface LoginService {
	
	public void updateEmployeeStatus(Login login);
	

}
