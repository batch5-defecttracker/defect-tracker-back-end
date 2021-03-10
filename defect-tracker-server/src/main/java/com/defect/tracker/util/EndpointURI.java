package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
//Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";


//getEmployee
	public static final String GetEmployeebyName = BASE_API_PATH + "getEmployeebyName/{firstName}";

//GetEmployeeByStatus
	public static final String LOGINSTATUS = BASE_API_PATH + "loginstatus";

	public static final String DELETE_EMPLOYEE =  BASE_API_PATH + "deleteEmployee/{id}";

	public static final String EMPLOYEE_GET = BASE_API_PATH + "employeeGet/{id}";
	
	public static final String GET_EMPLOYEE_BY_DESIGNATION = BASE_API_PATH + "getEmployeebyDesignation/{designationId}";
	
	
//Project	
	public static final String PROJECT = BASE_API_PATH + "project";
	
	public static final String PROJECT_FIND = BASE_API_PATH + "find/{id}";
	
	public static final String PROJECT_DELETE = BASE_API_PATH + "delete/{id}";
	
	public static final String UPDATE_PROJECT = BASE_API_PATH + "update";


	
//Module
	public static final String MODULE = BASE_API_PATH + "module";
	
	public static final String MODULE_ADD = BASE_API_PATH + "addmodule";
	
	public static final String MODULE_DELETE = BASE_API_PATH + "deletemodule/{id}";

//SubModule
	public static final String getSubModule = BASE_API_PATH + "SubModule/{moduleId}";
	public static final String UpdateSubModule = BASE_API_PATH + "SubModule";
	public static final String SUBMODULE_DELETE = BASE_API_PATH + "deleteSubModule/{id}";
//Defect
	public static final String DEFECT_ADD = BASE_API_PATH + "addDefect";
	public static final String DEFECT_UPDATE = BASE_API_PATH + "updateDefect";


	//getEmployee	


	public static final String EMPLOYEE_DEALLOCATION_FOR_SUBMODULE=BASE_API_PATH +"ProjectEmployee/{id}";

//getAllStatus
	public static final String DEFECTSTATUS = BASE_API_PATH + "getstatus";


//DefectType
	public static final String DEFECTTYPE = BASE_API_PATH + "defecttype";


//GetAllSeverity
	public static final String getAllSeverity = BASE_API_PATH + "severity";

//GetAllPriority
	public static final String getAllPriority = BASE_API_PATH + "getAllpriority";
	
//GetAPIsubModuleAllocation
	public static final String GETAPI_SUBMODULEALLOCATION = BASE_API_PATH + "SubmoduleAllocation/{SubModuleId}";

		
	private EndpointURI() {
		
	}
}

