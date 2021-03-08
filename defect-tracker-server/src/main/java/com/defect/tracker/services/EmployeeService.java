package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);

	public boolean isEmailAlreadyExist(String email);
	
<<<<<<< HEAD
=======
	public void deleteEmployee(Long id);
	
	public boolean isEmployeeExists(Long id);
>>>>>>> fc033f981b2922408ff2d739426863c3492e03c2
}
