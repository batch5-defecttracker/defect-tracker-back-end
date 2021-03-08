package com.defect.tracker.services;
import java.util.Optional;
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

	

	
	
}
