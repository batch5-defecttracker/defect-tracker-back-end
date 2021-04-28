package com.defect.tracker.util;

public class Constants {
	// employee
	public static final String EMPLOYEE_ADD_SUCCESS = "Employee Added Successfully";
	public static final String EMPLOYEE_DELETE_SUCCESS = "Employee Deleted Successfully";
	public static final String EMPLOYEE_STATUS_UPDATED = "Employee Status Updated Successfully";
	public static final String EMPLOYEE_PHOTO_NULL = "Employee Photo is NULL";
	public static final String EMPLOYEE_UPDATE_FIELD_IS_EMPTY = "Empty Employee field ";
	public static final String EMPLOYEE_NOT_EXISTS = "Employee Not Exists";
	public static final String DEFAULT_VERIFICATION = "Not-Verified";
	public static final String VERIFICATION_PATH = "/api/v1/email-verification/email/";
	public static final String VERIFICATION_TOKEN = "/token/";
	
	// project
	public static final String PROJECT_ADDED_SUCCESS = "Project added successfully ";
	public static final String PROJECT_FOUND = "Project Found";
	public static final String PROJECT_UPDATED = "Project Updated";
	public static final String PROJECT_DELETED = "Project Deleted";

	// module
	public static final String MODULE_ADD_SUCCESS = "Module Added Successfully";

	public static final String EMPLOYEE_UPDATE_SUCCESS = "Employee Update Successfully";

	public static final String UpdateSubmodule = "SubModule updated successfully ";

	public static final String ADD_EMPLOYEE_PHOTO_SUCCESS = " Employee Photo Add Successfully";

	public static final String EMPLOYEE_DEALLOCATION_SUCCESS_TO_SUBMODULE = "Submodule employee deallocation successfully";

	// public static final String
	// EMPLOYEE_DEALLOCATION_SUCCESS_TO_SUBMODULE="Submodule employee deallocation
	// successfully";
	public static final String MODULE_UPDATE_SUCCESS = "Module Successfully Updated";
	public static final String MODULE_DELETE_SUCCESS = "Module Deleted Successfully";

	// submodule
	public static final String SUBMODULE_ADDED = "SubModule Added Successfully";
	public static final String SUBMODULE_DELETED = "SubModule Deleted";

	// projectEmployee
	public static final String PROJECT_ALLOCATED = "Project Allocated Successfully";
	public static final String PROJECT_DEALLOCATED = "Project Deallocated Successfully";

	// defect
	public static final String DEFECT_ADD_SUCCESS = "Defect added successfully";
	public static final String UPDATE_DEFECT = "Defect update successfully";

	public static final String EMPLOYEE_PHOTO_DELETE_SUCCESS = "Employee Photo Delete Successfully";
	public static final String EMPLOYEE_PHOTO_UPDATE_SUCCESS = "Employee Photo Successfully Updated";
	
	public static final String PROJECT_EMP_UPDATE = "updateProjectEmp SuccessFully";

	// Login
	public static final String LOGIN_SUCCESS = "Login Success";
	public static final String WRONG_USER_NAME = "User Name Invalid !";
	public static final String WRONG_PASSWORD = "Password Invalid !";
	public static final String LOGIN_FAILED = "Login Failed";
	public static final String USER_NAME_OR_PASSWORD_EMPTY = "Empty field !!";
	public static final String CHANGED_SUCCESS = "Success fully Changed ";
	public static final String SENT_SUCCESS = "Email Sent Successfully ";
	public static final String VERIFIED = "Email is Verified Successfully";
	public static final String DEFAULT_STATUS = "Inactive";

	
	// Password
	public static final String PASSWORD_CHANGED_SUCCESS = "Password changed successfully";

//	DefectStatus
	public static final String OPEN = "Open";
	public static final String NEW = "New";
	public static final String RE_OPEN = "Reopen";
	public static final String FIXED = "Fixed";
	public static final String CLOSED = "Closed";
	public static final String REJECT = "Reject";
	// encaptulate constructor to restrict modification from outside

	private Constants() {
	}
}
