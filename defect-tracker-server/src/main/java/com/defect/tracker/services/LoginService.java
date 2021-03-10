package com.defect.tracker.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;

@Service
public interface LoginService {
	
	public List<Login> getEmployee(String status);

	

}
