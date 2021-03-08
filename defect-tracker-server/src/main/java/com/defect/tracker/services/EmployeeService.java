package com.defect.tracker.services;
<<<<<<< HEAD
import java.util.Optional;
=======


import java.util.Optional;

import java.util.List;


>>>>>>> afb5b6f437eedf3792edacbac1e5e89a0ae62570
import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public boolean isEmailAlreadyExist(String email);
<<<<<<< HEAD
	
	public Optional<Employee> findByFirstName(String firstName);
	/* public boolean firstnameExist(String firstName); */
=======


	public Optional <Employee> findById(Long id);
	
	public boolean idExist(Long id);
	

	//public void deleteEmployee(Long id);
	
	//public boolean isEmployeeExists(Long id);


	


	public List<Employee> getAll();
	

	public void deleteEmployee(Long id);
	
	public boolean isEmployeeExists(Long id);

>>>>>>> afb5b6f437eedf3792edacbac1e5e89a0ae62570

}
