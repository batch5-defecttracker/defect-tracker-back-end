package com.defect.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.EmployeeDto;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.EmployeeService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@Autowired
	private Mapper mapper;

	@PostMapping(value = EndpointURI.EMPLOYEE)
	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeDto employeeDto) {
		if (employeeService.isEmailAlreadyExist(employeeDto.getEmail())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMAIL_EXISTS,
					validationFailureStatusCodes.getEmailAlreadyExist()), HttpStatus.BAD_REQUEST);
		}
		Employee employee = mapper.map(employeeDto, Employee.class);
		employeeService.createEmployee(employee);
		return new ResponseEntity<Object>(Constants.EMPLOYEE_ADD_SUCCESS, HttpStatus.OK);
	}
	
	@GetMapping(value = EndpointURI.EMPLOYEE)
	public ResponseEntity<Object> getAllEmp(){
		if (employeeService.getAll().isEmpty()) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_EMPTY,
					validationFailureStatusCodes.getEmployeeNotFound()), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Object>(employeeService.getAll(), HttpStatus.OK);
	}
	

	/*
	 * @GetMapping(value = EndpointURI.EMPLOYEE) public List<Employee> getAllEmp(){
	 * 
	 * return employeeService.getAll(); }
	 */
}