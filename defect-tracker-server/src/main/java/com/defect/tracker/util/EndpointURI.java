package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
//Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
<<<<<<< HEAD
=======
	
	public static final String PROJECT = BASE_API_PATH + "project";
>>>>>>> d4839a85d9c878273346bb7b178745f905596f95

	
	
//Project	
	public static final String PROJECT_FIND = BASE_API_PATH + "find/{id}";
	
	public static final String PROJECT_DELETE = BASE_API_PATH + "delete/{id}";

<<<<<<< HEAD
	public static final String DELETE_EMPLOYEE =  BASE_API_PATH + "deleteEmployee/{id}";

=======
//Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String MODULE_ADD = BASE_API_PATH + "addmodule";
	public static final String MODULE_DELETE = BASE_API_PATH + "deletemodule/{id}";
	public static final String DELETE_EMPLOYEE =  BASE_API_PATH + "deleteEmployee/{id}";
	public static final String UpdateSubModule = BASE_API_PATH + "SubModule";
	
//getAllStatus
	public static final String DEFECTSTATUS = BASE_API_PATH + "getstatus";
>>>>>>> d4839a85d9c878273346bb7b178745f905596f95

//DefectType
	public static final String DEFECTTYPE = BASE_API_PATH + "defecttype";

//GetAllSeverity
	public static final String getAllSeverity = BASE_API_PATH + "severity";

	
	private EndpointURI() {
	}
}

