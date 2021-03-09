package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
//Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";

	public static final String PROJECT = BASE_API_PATH + "project";


//Project	
	public static final String PROJECT_FIND = BASE_API_PATH + "find/{id}";
	
	public static final String PROJECT_DELETE = BASE_API_PATH + "delete/{id}";
	
	public static final String UPDATE_PROJECT = BASE_API_PATH + "update";

	public static final String DELETE_EMPLOYEE =  BASE_API_PATH + "deleteEmployee/{id}";

	
//Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String MODULE_ADD = BASE_API_PATH + "addmodule";
	public static final String MODULE_DELETE = BASE_API_PATH + "deletemodule/{id}";
	public static final String UpdateSubModule = BASE_API_PATH + "SubModule";

//SubModule
	public static final String getSubModule = BASE_API_PATH + "SubModule/{moduleId}";
	
//getAllStatus
	public static final String DEFECTSTATUS = BASE_API_PATH + "getstatus";


//DefectType
	public static final String DEFECTTYPE = BASE_API_PATH + "defecttype";

//GetAllSeverity
	public static final String getAllSeverity = BASE_API_PATH + "severity";

	
	private EndpointURI() {
	}
}

