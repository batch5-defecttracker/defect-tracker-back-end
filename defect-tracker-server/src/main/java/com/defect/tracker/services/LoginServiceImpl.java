package com.defect.tracker.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.repositories.LoginRepository;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepositroy;

	@Override
	public void updateEmployeeStatus(Login login) {
		loginRepositroy.save(login);	
	}

}
