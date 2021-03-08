package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
//Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	
//DefectType
	public static final String DEFECTTYPE = BASE_API_PATH + "defecttype";

	private EndpointURI() {
	}
}
