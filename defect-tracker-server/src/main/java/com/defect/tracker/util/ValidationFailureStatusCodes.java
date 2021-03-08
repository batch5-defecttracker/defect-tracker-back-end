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
	
	@Value("${validation.project.notExist}")
	private String projectNotExist;

	public String getEmailAlreadyExist() {
		return emailAlreadyExist;
	}

	public void setEmailAlreadyExist(String emailAlreadyExist) {
		this.emailAlreadyExist = emailAlreadyExist;
	}


	public String getProjectNotExist() {
		return projectNotExist;
	}

	public void setProjectNotExist(String projectNotExist) {
		this.projectNotExist = projectNotExist;
	}
	
	
	@Value("${validation.employee.alreadyExist}")
	private String employeeAlreadyExist;

	public String getEmployeeAlreadyExist() {
		return employeeAlreadyExist;
	}

	public void setEmployeeAlreadyExist(String employeeAlreadyExist) {
		this.employeeAlreadyExist = employeeAlreadyExist;
	}

	
}
