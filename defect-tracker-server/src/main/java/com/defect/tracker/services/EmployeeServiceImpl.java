package com.defect.tracker.services;

import java.util.List;
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

	@Override
	public boolean idExist(Long id) {
	
		return employeeRepository.existsById(id);
	}
	
	@Override
	public boolean isEmployeeExists(Long id) {
		
		return employeeRepository.existsByDesignationId(id);
	}
	
	public List<Employee> getAll() {
		
		return employeeRepository.findAll();
	}

	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);	
	}

	@Override
	public List<Employee> findByDes(Long id) {
		return employeeRepository.findByDesignationId(id);
	}

	@Override
	public boolean imageExist(Long id) {
		
		return employeeRepository.existsById(id);
	}

	@Override
	public Employee findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findImage(Long id) {
		return employeeRepository.findById(id).get().getImage(); 
	}

	@Override
	public boolean isEmployeeAlreadyExists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}

