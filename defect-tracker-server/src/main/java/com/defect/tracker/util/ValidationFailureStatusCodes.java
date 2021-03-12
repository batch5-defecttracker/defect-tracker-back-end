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
	
	@Value("${validation.firstName.notExist}")
	private String employeeNotExists;

	@Value("${validation.email.alreadyExist}")
	private String emailAlreadyExist;
	
	@Value("${validation.defectType.notExist}")
	private String defectTypeNotFound;

	@Value("${validation.employee.notExist}")
	private String employeeNotExist;

	private String employeeNotFound;

	@Value("${validation.severity.notExist}")
	private String severityNotExist;

	@Value("${validation.project.notExist}")
	private String projectNotExist;
	
	@Value("${validation.module.notExist}")
	private String moduleNotExist;
	
	@Value("${validation.module.alreadyExist}")
	private String moduleAlreadyExist;

	@Value("${validation.project.AlreadyExists}")
	 private String proNameAlreadyExists;
	
	@Value("${validation.defect.notExist}")
	private String defectNotExist;

	@Value("{validation.projectemp.isProjectempExists}")
	private String projectempAlreadyExists;
	
	@Value("${validation.employeeIdType.notExist}")
	private String employeeIdNotFound;
	@Value("{validation.defect.statusNotExists}")
	private String defectStatusNotExist;

	public String getProjectempAlreadyExists() {
		return projectempAlreadyExists;
	}


	public void setProjectempAlreadyExists(String projectempAlreadyExists) {
		this.projectempAlreadyExists = projectempAlreadyExists;
	}
	
	@Value("{validation.project.getProjectempNotExist}")
	private String projectemployeeNotExists;
	
	public String getProjectemployeeNotExists() {
		return projectemployeeNotExists;
	}


	public void setProjectemployeeNotExists(String projectemployeeNotExists) {
		this.projectemployeeNotExists = projectemployeeNotExists;
	}
	
	@Value("${validation.employee.alreadyExist}")
	private String employeeAlreadyExist;

	@Value("${validation.subModule.notExist}")
	private String subModuleNotExist;
	
	@Value("${validation.projectAllocation.notExist}")
	private String projectAllocationNotExist;
	
	@Value("${validation.projectAllocation.failed}")
	private String projectAllocationFailed;

	public String getSubModuleNotExist() {
		return subModuleNotExist;
	}


	public void setSubModuleNotExist(String subModuleNotExist) {
		this.subModuleNotExist = subModuleNotExist;
	}

	@Value("${validation.submodule.notExist}")
	private String subModuleNotExists;

	

	public String getSubModuleNotExists() {
		return subModuleNotExists;
	}

	public void setSubModuleNotExists(String subModuleNotExists) {
		this.subModuleNotExists = subModuleNotExists;
	}

	@Value("${validation.priority.notExist}")
	private String priorityNotExist;
	
	public String getPriorityNotExist() {
		return priorityNotExist;
	}
	public void setPriorityNotExist(String priorityNotExist) {
		this.priorityNotExist = priorityNotExist;
	}

	public String getEmailAlreadyExist() {
		return emailAlreadyExist;
	}
	public void setEmailAlreadyExist(String emailAlreadyExist) {
		this.emailAlreadyExist = emailAlreadyExist;
	}

	public String getDefectTypeNotFound() {
		return defectTypeNotFound;
	}

	public void setDefectTypeNotFound(String defectTypeNotFound) {
		this.defectTypeNotFound = defectTypeNotFound;
	}
	
	
	
	public void setProNameAlreadyExists(String proNameAlreadyExists) {
		this.proNameAlreadyExists = proNameAlreadyExists;
	}
	public String getProNameAlreadyExists() {
		return proNameAlreadyExists;
	}

	public String getEmployeeNotExists() {
		return employeeNotExists;
	}
	public void setEmployeeNotExists(String employeeNotExists) {
		this.employeeNotExists = employeeNotExists;
		
	}
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

	public String getDefectNotExist() {
		return defectNotExist;
	}
	public void setDefectNotExist(String defectNotExist) {
		this.defectNotExist = defectNotExist;
		
	}
	
	
	@Value("${validation.subModule.AlreadyExist}")
	private String subModuleAlreadyExist;

	public String getSubModuleAlreadyExist() {
		return subModuleAlreadyExist;
	}
	
	
	@Value("${validation.designation.notExist}")
	private String designationNotExist;


			public String getDesignationNotExist() {
		return designationNotExist;
	}

	public void setDesignationNotExist(String designationNotExist) {
		this.designationNotExist = designationNotExist;
	}


	

	public String getProjectAllocationNotExist() {
		return projectAllocationNotExist;
	}


	public void setProjectAllocationNotExist(String projectAllocationNotExist) {
		this.projectAllocationNotExist = projectAllocationNotExist;
	}


	public String getProjectAllocationFailed() {
		return projectAllocationFailed;
	}


	public void setProjectAllocationFailed(String projectAllocationFailed) {
		this.projectAllocationFailed = projectAllocationFailed;
	}


	public String getDefectStatusNotExist() {
		return defectStatusNotExist;
	}


	public void setDefectStatusNotExist(String defectStatusNotExist) {
		this.defectStatusNotExist = defectStatusNotExist;
	}
	
	
	
	


	public String getEmployeeIdNotFound() {
		return employeeIdNotFound;
	}


	public void setEmployeeIdNotFound(String employeeIdNotFound) {
		this.employeeIdNotFound = employeeIdNotFound;
	}

	
	public void setSubModuleAlreadyExist(String subModuleAlreadyExist) {
		this.subModuleAlreadyExist = subModuleAlreadyExist;
	}
	

}
