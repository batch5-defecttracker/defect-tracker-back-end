package com.defect.tracker.services;


import java.util.Optional;
import java.util.List;
import com.defect.tracker.data.entities.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public boolean isEmailAlreadyExist(String email);
	public Optional<Employee> findByFirstName(String firstName);
	public Optional <Employee> findById(Long id);
	public boolean idExist(Long id);
	public List<Employee> findByDes(Long id);



	//public void deleteEmployee(Long id);
	

	
	public boolean isEmployeeExists(Long id);


	public List<Employee> getAll();

	public void deleteEmployee(Long id);


}
