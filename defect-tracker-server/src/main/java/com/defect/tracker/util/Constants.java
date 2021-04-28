package com.defect.tracker.util;

public class Constants {
	// employee
	public static final String EMPLOYEE_ADD_SUCCESS = "Employee Added Successfully ,Verification Code Send To Your Mail";
	public static final String EMPLOYEE_DELETE_SUCCESS = "Employee Deleted Successfully";
	public static final String EMPLOYEE_STATUS_UPDATED = "Employee Status Updated Successfully";
	public static final String EMPLOYEE_PHOTO_NULL = "Employee Photo is NULL";
	public static final String EMPLOYEE_NOT_EXISTS = "Employee Not Exists";
	public static final String VERIFICATION_PATH = "/api/v1/email-verification/email/";
	public static final String VERIFICATION_TOKEN = "/token/";
	// project
	public static final String PROJECT_ADDED_SUCCESS = "Project Added Successfully";
	public static final String PROJECT_UPDATED = "Project Updated Successfully";
	public static final String PROJECT_DELETED = "Project Deleted Successfully";
	// module
	public static final String MODULE_ADD_SUCCESS = "Module Added Successfully";
	public static final String EMPLOYEE_UPDATE_SUCCESS = "Employee Update Successfully";
	public static final String UPDATE_SUBMODULE = "SubModule Updated Successfully ";
	public static final String ADD_EMPLOYEE_PHOTO_SUCCESS = " Employee Photo Added Successfully";
	public static final String MODULE_UPDATE_SUCCESS = "Module Updated Successfully";
	public static final String MODULE_DELETE_SUCCESS = "Module Deleted Successfully";
	// submodule
	public static final String SUBMODULE_ADDED = "SubModule Added Successfully";
	public static final String SUBMODULE_DELETED = "SubModule Deleted Successfully";
	// projectEmployee
	public static final String PROJECT_ALLOCATED = "Employee Allocated For This Project Successfully";
	public static final String PROJECT_DEALLOCATED = "Employee Deallocated For This Project Successfully";
	// defect
	public static final String DEFECT_ADD_SUCCESS = "Defect Added Successfully";
	public static final String UPDATE_DEFECT = "Defect Updated Successfully";
	public static final String EMPLOYEE_PHOTO_DELETE_SUCCESS = "Employee Photo Deleted Successfully";
	public static final String EMPLOYEE_PHOTO_UPLOAD = "Employee Photo Uploaded Successfully";
	// severity
	public static final String PROJECT_EMPLOYEE_UPDATE = "Project Allocation Updated Successfully";
	// Login
	public static final String LOGIN_SUCCESS = "Login Successed";
	public static final String WRONG_USER_NAME = "UserName Invalid !";
	public static final String WRONG_PASSWORD = "Password Invalid !";
	public static final String LOGIN_FAILED = "Login Failed";
	public static final String USER_NAME_OR_PASSWORD_EMPTY = "Empty Field !!";
	public static final String PASSWORD_RESET_SUCCESS = "Password Reset Successfully";
	public static final String SENT_SUCCESS = "Email Sent Successfully ";
	public static final String VERIFIED = "Email Verified Successfully";
	public static final String ACTIVATED = "Activated";
	// Password
	public static final String PASSWORD_CHANGED_SUCCESS = "Password Changed Successfully";
	// DefectStatus
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