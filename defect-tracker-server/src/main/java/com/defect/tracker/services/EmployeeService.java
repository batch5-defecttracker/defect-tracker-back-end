package com.defect.tracker.services;

import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);

	public boolean isEmailAlreadyExist(String email);
}
