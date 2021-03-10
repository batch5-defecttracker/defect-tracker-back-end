package com.defect.tracker.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.repositories.LoginRepository;

public class LoginServiceImpl implements LoginService {
	@Autowired LoginRepository loginRepository;

	@Override
	public List<Login> getEmployee(String status) {
		
		return loginRepository.getByStatus(status);
	}

	
	
	
	

}
