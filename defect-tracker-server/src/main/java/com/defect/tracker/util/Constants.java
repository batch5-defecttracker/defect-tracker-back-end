package com.defect.tracker.util;

public class Constants {
	
	//employee
	public static final String EMPLOYEE_ADD_SUCCESS = "Employee Added Successfully";
	public static final String EMPLOYEE_DELETE_SUCCESS = "Employee Deleted Successfully";
	public static final String EMPLOYEE_STATUS_UPDATED = "Employee Status Updated Successfully";
	
	
	
	//project
	public static final String PROJECT_ADDED_SUCCESS = "Project added successfully "; 
	public static final String PROJECT_FOUND = "Project Found";
	public static final String PROJECT_UPDATED = "Project Updated";
	public static final String PROJECT_DELETED = "Project Deleted";
	
	
	//module
	public static final String MODULE_ADD_SUCCESS = "Module Added Successfully";
	public static final String MODULE_UPDATE_SUCCESS = "Module Successfully Updated";
	public static final String MODULE_DELETE_SUCCESS = "Module Deleted Successfully";
	
	
	
	//submodule
	public static final String SUBMODULE_ADDED = "SubModule Added Successfully";
	public static final String UpdateSubmodule= "SubModule updated successfully ";
	public static final String SUBMODULE_DELETED ="SubModule Deleted";
	
	
	
	//projectEmployee
	public static final String PROJECT_ALLOCATED ="Project Allocated Successfully";
	public static final String PROJECT_DEALLOCATED = "Project Deallocated Successfully";
	
	
	//defect
    public static final String DEFECT_ADD_SUCCESS = "Defect added successfully";
	public static final String UPDATE_DEFECT = "Defect update successfully";
	
	
	//severity
	public static final String Get_All_Severity = "Severity got Successfully";

	public static final MultiValueMap<String, String> EMPLOYEE_DEALLOCATION_SUCCESS_TO_SUBMODULE = null;
	
	public static final String PROJECT_EMP_UPDATE = "updateProjectEmp SuccessFully";

	// encaptulate constructor to restrict modification from outside
	
	private Constants() {
	}
}
