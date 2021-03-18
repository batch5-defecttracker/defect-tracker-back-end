package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	private static final String ID="/{id}";
	private static final String SLASH="/";

	//getEmployee 
	public static final String GET_EMPLOYEE_BY_NAME = BASE_API_PATH + "getEmployeebyName/{firstName}";
	public static final String LOGINSTATUS = BASE_API_PATH + "loginstatus";
	public static final String DELETE_EMPLOYEE =  BASE_API_PATH + "deleteEmployee/{id}";
	public static final String EMPLOYEE_GET = BASE_API_PATH + "employeeGet/{id}";
	public static final String GET_EMPLOYEE_BY_DESIGNATION = BASE_API_PATH + "getEmployeebyDesignation/{designationId}";

	// Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	public static final String EMPLOYEE_PHOTO = EMPLOYEE + SLASH + "photo" + ID;
	public static final String ACT_EMPLOYEE = EMPLOYEE + ID;
	
	
	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String ACT_PROJECT= PROJECT + ID;

	// Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String MODULE_ADD = BASE_API_PATH + "addmodule";
	public static final String GET_MODULE_BY_PROJECT = BASE_API_PATH + "getModulebyProject/{projectId}";
	public static final String MODULE_DELETE = BASE_API_PATH + "deletemodule/{id}";
 	public static final String MODULE_UPDATE = BASE_API_PATH + "updateModule";
	
	
	//SubModule
	public static final String SUBMODULE_ADD = BASE_API_PATH + "submodule";
	public static final String GET_SUB_MODULE = BASE_API_PATH + "SubModule/{moduleId}";
	public static final String UPDATE_SUB_MODULE = BASE_API_PATH+ "subModule";
	public static final String UpdateSubModule = BASE_API_PATH +"SubModule";
	public static final String SUBMODULE_DELETE = BASE_API_PATH + "deleteSubModule/{id}";


	// SubModule
	public static final String SUBMODULE = BASE_API_PATH + "submodule";
	public static final String GET_SUBMODULE = SUBMODULE + SLASH + "module" + SLASH + "{moduleId}";
	

	// Defect
	public static final String DEFECT = BASE_API_PATH + "defect";
	public static final String UPDATE_DEFECT_STATUS =DEFECT + ID + SLASH + "status" + SLASH + "{status}";
	public static final String DEFECT_GET_BY_ID = DEFECT + ID;
	public static final String GET_DEFECT_BY_SERACH = BASE_API_PATH + "getDefectBySearch";

	//designation
	public static final String GET_ALL_DESIGNATION = BASE_API_PATH + "designation";
	
	

	// designation
	public static final String DESIGNATION = BASE_API_PATH + "designation";


	// projectEmployee
	public static final String EMPLOYEE_DEALLOCATION_FOR_SUBMODULE = BASE_API_PATH + "project-employee" + ID;
	
	// Project Deallocation
	public static final String PROJECT_ALLOCATION = BASE_API_PATH + "project-allocation";
	public static final String DEALLOCATE_PROJECT = PROJECT_ALLOCATION+ ID;
	public static final String MODULE_ALLOCATION = BASE_API_PATH + "module-allocation";

	// projectEmp
	public static final String UPDATE_PROJECT_EMPLOYEE_ALLOCATION = PROJECT_ALLOCATION;
	public static final String GET_EMPLOYEE_BY_MODULE= PROJECT_ALLOCATION+"/get-emploee-by-module"+ID;
	
	// getAllStatus
	public static final String DEFECTSTATUS = BASE_API_PATH + "defect-status";
	public static final String DEFECT_STATUS =  DEFECTSTATUS +SLASH+"defect" + ID;

	// DefectType
	public static final String DEFECTTYPE = BASE_API_PATH + "defect-type";

	// GetAllSeverity
	public static final String SEVERITY = BASE_API_PATH + "severity";


	//GetAllSeverity

	public static final String GET_ALL_SEVERITY = BASE_API_PATH + "severity";

	
 
	

	//GetAllPriority
	public static final String GET_ALL_PRIORITY = BASE_API_PATH + "getAllpriority";
	

	// GetAllPriority
	public static final String PRIORITY = BASE_API_PATH + "priority";


	// Login
	public static final String UPDATE_EMPLOYEE_STATUS = BASE_API_PATH + "employee-status-update" + SLASH + "email" + SLASH + "{email}" + SLASH + "status" + SLASH + "{status}";

		
	

	//projectEmp
	public static final String UPDATE_PROJECT_EMP=BASE_API_PATH+"updateProjectEmp";
		
	//get image
	public static final String getImage = BASE_API_PATH + "getImage/{id}";


	
	private EndpointURI() {

	}
}
