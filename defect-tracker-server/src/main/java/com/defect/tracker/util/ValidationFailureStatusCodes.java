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

	
	@Value("${validation.severity.notExist}")
	private String severityNotExist;

	@Value("${validation.project.notExist}")
	private String projectNotExist;

	@Value("${validation.module.notExist}")
	private String moduleNotExist;
	
	@Value("${validation.module.alreadyExist}")
	private String moduleAlreadyExist;
	

	@Value("${validation.employee.alreadyExist}")
	private String employeeAlreadyExist;

	@Value("{validation.project.AlreadyExists}")
	 private String proNameAlreadyExists;

	public void setProNameAlreadyExists(String proNameAlreadyExists) {
		this.proNameAlreadyExists = proNameAlreadyExists;
	}


	public String getEmailAlreadyExist() {
		return emailAlreadyExist;
	}

	public void setEmailAlreadyExist(String emailAlreadyExist) {
		this.emailAlreadyExist = emailAlreadyExist;
	}


	public String getSeverityNotExist() {
		return severityNotExist;
	}

	public void setSeverityNotExist(String severityNotExist) {
		this.severityNotExist = severityNotExist;
	}
	
	public String getProjectNotExist() {
		return projectNotExist;
	}

	public void setProjectNotExist(String projectNotExist) {
		this.projectNotExist = projectNotExist;
	}


	public String getModuleNotExist() {
		return moduleNotExist;
	}

	public void setModuleNotExist(String moduleNotExist) {
		this.moduleNotExist = moduleNotExist;
	}

	public String getModuleAlreadyExist() {
		return moduleAlreadyExist;
	}

	public void setModuleAlreadyExist(String moduleAlreadyExist) {
		this.moduleAlreadyExist = moduleAlreadyExist;
	}


	public String getEmployeeAlreadyExist() {
		return employeeAlreadyExist;
	}

	public void setEmployeeAlreadyExist(String employeeAlreadyExist) {
		this.employeeAlreadyExist = employeeAlreadyExist;
	}


	public String getProNameAlreadyExists() {
		return proNameAlreadyExists;
	}


}
