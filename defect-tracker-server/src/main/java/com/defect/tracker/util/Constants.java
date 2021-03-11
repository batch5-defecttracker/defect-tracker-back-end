package com.defect.tracker.util;

import org.springframework.util.MultiValueMap;

public class Constants {
	public static final String EMPLOYEE_ADD_SUCCESS = "Employee Added Successfully";
	public static final String PROJECT_FOUND = "Project Found";
	public static final String PROJECT_DELETED = "Project Deleted";
	public static final String EMPLOYEE_DELETE_SUCCESS = "Employee Deleted Successfully";
	public static final String PROJECT_UPDATED = "Project Updated";

	public static final String PROJECT_DEALLOCATED = "Project Deallocated Successfully";
	public static final String MODULE_DELETE_SUCCESS = "Module Deleted Successfully";
	public static final String MODULE_ADD_SUCCESS = "Module Added Successfully";
	public static final String PROJECT_ADDED_SUCCESS = "Project added successfully "; 
	public static final String UpdateSubmodule= "SubModule updated successfully ";
	//public static final String EMPLOYEE_DEALLOCATION_SUCCESS_TO_SUBMODULE="Submodule employee deallocation successfully";
	public static final String SUBMODULE_DELETED ="SubModule Deleted";
	public static final String PROJECT_ALLOCATED ="Project Allocated Successfully";
	public static final String DEFECT_ADD_SUCCESS = "Defect added successfully";
	public static final String UPDATE_DEFECT = "Defect update successfully";
	public static final String Get_All_Severity = "Severity got Successfully";
	
	public static final String EMPLOYEE_STATUS_UPDATED = "Employee Status Updated Successfully";
	
	public static final String MODULE_UPDATE_SUCCESS = "Module Successfully Updated";
	public static final MultiValueMap<String, String> EMPLOYEE_DEALLOCATION_SUCCESS_TO_SUBMODULE = null;

	// encaptulate constructor to restrict modification from outside
	
	private Constants() {
	}
}
