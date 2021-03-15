package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";

	// Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	
	//Employee Photo
	public static final String EMPLOYEE_PHOTO = BASE_API_PATH + "EmployeePhoto/{id}";

	// getEmployee
	public static final String ACT_EMPLOYEE = BASE_API_PATH + "employee/{id}";
	
	public static final String GET_EMPLOYEE_BY_NAME = BASE_API_PATH + "getEmployeebyName/{firstName}";
	public static final String LOGINSTATUS = BASE_API_PATH + "loginstatus";
	public static final String GET_EMPLOYEE_BY_DESIGNATION = BASE_API_PATH + "getEmployeebyDesignation/{designationId}";

	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String ACT_PROJECT= BASE_API_PATH + "project/{id}";

	// Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String GET_MODULE_BY_PROJECT = BASE_API_PATH + "getModulebyProject/{projectId}";
	public static final String MODULE_DELETE = BASE_API_PATH + "deletemodule/{id}";

	// SubModule
	public static final String SUBMODULE = BASE_API_PATH + "submodule";
	public static final String GET_SUBMODULE = BASE_API_PATH + "SubModule/{moduleId}";
	public static final String SUBMODULE_DELETE = BASE_API_PATH + "deleteSubModule/{id}";

	// Defect
	public static final String DEFECT = BASE_API_PATH + "defect";
	public static final String UPDATE_DEFECT_STATUS = BASE_API_PATH + "updateDefectStatus/{id}/status/{status}";

	// designation
	public static final String DESIGNATION = BASE_API_PATH + "designation";
	public static final String DEFECT_GET_BY_ID = BASE_API_PATH + "getDefect/{id}";

	// projectEmployee
	public static final String EMPLOYEE_DEALLOCATION_FOR_SUBMODULE = BASE_API_PATH + "ProjectEmployee/{id}";
	
	// Project Deallocation
	public static final String PROJECT_ALLOCATION = BASE_API_PATH + "projectAllocation";
	public static final String DEALLOCATE_PROJECT = BASE_API_PATH + "deallocateProject/{id}";
	public static final String MODULE_ALLOCATION = BASE_API_PATH + "moduleAllocation";

	// projectEmp
	public static final String UPDATE_PROJECT_EMP = BASE_API_PATH + "updateProjectEmp";

	// getAllStatus
	public static final String DEFECTSTATUS = BASE_API_PATH + "defectstatus";
	public static final String DEFECT_STATUS = BASE_API_PATH + "getCurrentStatus/{id}";

	// DefectType
	public static final String DEFECTTYPE = BASE_API_PATH + "defecttype";

	// GetAllSeverity
	public static final String SEVERITY = BASE_API_PATH + "severity";

	// GetAllPriority
	public static final String PRIORITY = BASE_API_PATH + "priority";

	// Login
	public static final String UPDATE_EMPLOYEE_STATUS = BASE_API_PATH + "employeeStatusUpdate";


	private EndpointURI() {

	}
}
