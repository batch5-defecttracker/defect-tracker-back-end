package com.defect.tracker.services;

import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);

	public boolean isEmailAlreadyExist(String email);
	
	public void deleteEmployee(Long id);
	
	public boolean isEmployeeExists(Long id);
}
