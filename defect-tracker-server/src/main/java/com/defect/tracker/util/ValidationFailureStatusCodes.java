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
<<<<<<< HEAD
=======
	

	@Value("${validation.employee.notExist}")
>>>>>>> 5c271634221168e42c8ab6415cfa6243b3cf93bf

	@Value("${validation.employee.notExist}")
	private String employeeNotExist;

	private String employeeNotFound;
<<<<<<< HEAD
	
=======

>>>>>>> 5c271634221168e42c8ab6415cfa6243b3cf93bf
	@Value("${validation.module.notExist}")
	private String moduleNotExist;
	
	@Value("${validation.module.alreadyExist}")
	private String moduleAlreadyExist;
	
	@Value("${validation.employee.alreadyExist}")
	private String employeeAlreadyExist;
<<<<<<< HEAD
=======


>>>>>>> 5c271634221168e42c8ab6415cfa6243b3cf93bf

	public String getEmailAlreadyExist() {
		return emailAlreadyExist;
	}

	public void setEmailAlreadyExist(String emailAlreadyExist) {
		this.emailAlreadyExist = emailAlreadyExist;
	}

<<<<<<< HEAD
=======
	

	@Value("${validation.firstName.notExist}")
	private String employeeNotExists;
	
	
	public String getEmployeeNotExists() {
		return employeeNotExists;
	}

	public void setEmployeeNotExists(String employeeNotExists) {
		this.employeeNotExists = employeeNotExists;


	}
>>>>>>> 5c271634221168e42c8ab6415cfa6243b3cf93bf
	public String getEmployeeNotExist() {
		return employeeNotExist;
	}

	public void setEmployeeNotExist(String employeeNotExist) {
		this.employeeNotExist = employeeNotExist;
	}
	


	public String getEmployeeNotFound() {
		return employeeNotFound;
	}

	public void setEmployeeNotFound(String employeeNotFound) {
		this.employeeNotFound = employeeNotFound;
	}
	
<<<<<<< HEAD
=======

	


//	@Value("${validation.employee.alreadyExist}")
//	private String employeeAlreadyExist;

>>>>>>> 5c271634221168e42c8ab6415cfa6243b3cf93bf
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
<<<<<<< HEAD
=======

>>>>>>> 5c271634221168e42c8ab6415cfa6243b3cf93bf

	public String getEmployeeAlreadyExist() {
		return employeeAlreadyExist;
	}

	public void setEmployeeAlreadyExist(String employeeAlreadyExist) {
		this.employeeAlreadyExist = employeeAlreadyExist;

	}
}
