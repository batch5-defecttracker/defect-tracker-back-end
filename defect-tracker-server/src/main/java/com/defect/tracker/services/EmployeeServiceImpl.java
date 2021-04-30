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
	public List<Employee> findByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

	@Override
	public boolean idExist(Long id) {
		return employeeRepository.existsById(id);
	}

	@Override
	public boolean isEmployeeExists(Long id) {
		return employeeRepository.existsById(id);
	}

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public List<Employee> findByDesignation(Long id) {
		return employeeRepository.findByDesignationId(id);
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public boolean isEmployeeAlreadyExists(Long id) {
		return employeeRepository.existsById(id);
	}

	@Override
	public boolean ExistByFirstName(String firstName) {
		return employeeRepository.existsByfirstName(firstName);
	}
}
