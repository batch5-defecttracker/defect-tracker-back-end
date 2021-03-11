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
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public boolean isEmployeeExists(Long id) {
		
		return employeeRepository.existsByDesignationId(id);
	}

	@Override
	public List<Employee> findByDes(Long id) {
		return employeeRepository.findByDesignationId(id);
	}

	@Override
	public boolean isEmployeeAlreadyExists(Long id) {
		return employeeRepository.existsById(id);
	}

	@Override
	public boolean isEmailAlreadyExist1(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteEmployee1(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmployeeExists1(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Employee> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean idExist(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
