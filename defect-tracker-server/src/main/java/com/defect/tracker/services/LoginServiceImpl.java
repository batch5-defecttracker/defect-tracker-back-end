package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.dto.LoginDto;
import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepositroy;

	@Autowired
	Mapper mapper;

	@Override
	public List<Login> getLoginByStatus(String status) {
		return loginRepositroy.findByStatus(status);
	}

	@Override
	public void updateEmployeeStatus(String email, String status) {
		Login login = loginRepositroy.findByEmail(email).get();
		LoginDto loginDto = mapper.map(login, LoginDto.class);
		loginDto.setStatus(status);
		login = mapper.map(loginDto, Login.class);
		loginRepositroy.save(login);
	}

	@Override
	public boolean isEmailAlreadyExist(String email) {
		return loginRepositroy.existsByEmail(email);
	}




	@Override
	public void create(Login login) {
		loginRepositroy.save(login);
		
	}

	@Override
	public void updateEmployeeStatus(Login login) {
		// TODO Auto-generated method stub
		
	}
	

	
}
