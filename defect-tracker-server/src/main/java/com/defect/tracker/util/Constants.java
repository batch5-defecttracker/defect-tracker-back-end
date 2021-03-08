package com.defect.tracker.util;

import org.springframework.util.MultiValueMap;

public class Constants {
	public static final String EMPLOYEE_ADD_SUCCESS = "Employee Added Successfully";

	public static final String PROJECT_FOUND = "Project Found";
	public static final String PROJECT_DELETED = "Project Deleted";


	public static final String MODULE_DELETE_SUCCESS = "Module Deleted Successfully";
	public static final String MODULE_ADD_SUCCESS = "Module Added Successfully";

	public static final String EMPLOYEE_DELETE_SUCCESS = "Employee Deleted Successfully";

	public static final MultiValueMap<String, String> PROJECT_ADDED_SUCCESS = null;



	// encaptulate constructor to restrict modification from outside
	private Constants() {
	}
}
