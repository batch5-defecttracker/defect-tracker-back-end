package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
//Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
<<<<<<< HEAD
	
	
//Project	
	public static final String PROJECT_FIND = BASE_API_PATH + "find/{id}";
	
	public static final String PROJECT_DELETE = BASE_API_PATH + "delete/{id}";
=======
	public static final String DELETE_EMPLOYEE =  BASE_API_PATH + "deleteEmployee/{id}";
>>>>>>> a166bfb7b0316749b459ba56df22fe00de9606f3

	private EndpointURI() {
	}
}
