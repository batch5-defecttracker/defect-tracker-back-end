package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
//Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	
//Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String MODULE_ADD = BASE_API_PATH + "addmodule";
	public static final String MODULE_DELETE = BASE_API_PATH + "deletemodule/{id}";

	public static final String DELETE_EMPLOYEE =  BASE_API_PATH + "deleteEmployee/{id}";


	
//getAllStatus
	public static final String DEFECTSTATUS = BASE_API_PATH + "getstatus";

	private EndpointURI() {
	}
}

