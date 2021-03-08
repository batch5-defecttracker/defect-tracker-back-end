package com.defect.tracker.services;

import java.util.Optional;



import java.util.Optional;

import java.util.ArrayList;
import java.util.List;



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
	public Optional<Employee> findByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

	
	/*
	 * @Override public boolean firstnameExist(String firstName) {
	 * return employeeRepository.existsByFirstName(firstName); }
	 */

	

	
	

	@Override


	public Optional<Employee> findById(Long id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	public boolean idExist(Long id) {
	
		return employeeRepository.existsById(id);
	}

	


	public List<Employee> getAll() {
		
		return employeeRepository.findAll();
	}



	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public boolean isEmployeeExists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	


}

