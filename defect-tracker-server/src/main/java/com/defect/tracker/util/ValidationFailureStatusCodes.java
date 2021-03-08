package com.defect.tracker.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * contains custom error messages
 *
 */

@Component
@PropertySource("classpath:ValidationMessages.properties")
public class ValidationFailureStatusCodes {

	@Value("${validation.email.alreadyExist}")
	private String emailAlreadyExist;
	
	@Value("${validation.employee.notExist}")
	private String employeeNotFound;

	public String getEmailAlreadyExist() {
		return emailAlreadyExist;
	}

	public void setEmailAlreadyExist(String emailAlreadyExist) {
		this.emailAlreadyExist = emailAlreadyExist;
	}

	public String getEmployeeNotFound() {
		return employeeNotFound;
	}

	public void setEmployeeNotFound(String employeeNotFound) {
		this.employeeNotFound = employeeNotFound;
	}
	
	
}
