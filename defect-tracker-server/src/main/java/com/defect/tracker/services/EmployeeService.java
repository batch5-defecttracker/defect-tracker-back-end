package com.defect.tracker.services;

import java.util.Optional;
import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);

	public boolean isEmailAlreadyExist(String email);
	
	public Optional <Employee> findById(Long id);
	
	public boolean idExist(Long id);
	
}
