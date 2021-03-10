package com.defect.tracker.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	

	
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void createEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public boolean isEmailAlreadyExist(String email) {
		return employeeRepository.existsByEmail(email);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public boolean isEmployeeExists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void UpdateEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}

	
	

}
