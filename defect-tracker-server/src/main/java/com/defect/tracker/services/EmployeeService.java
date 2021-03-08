package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);

	public boolean isEmailAlreadyExist(String email);
	
<<<<<<< HEAD
	public List<Employee> getAll();
	
=======
	public void deleteEmployee(Long id);
	
	public boolean isEmployeeExists(Long id);
>>>>>>> 7f68da36fed15ea7a54bf643bf4473de8f620bf1
}
