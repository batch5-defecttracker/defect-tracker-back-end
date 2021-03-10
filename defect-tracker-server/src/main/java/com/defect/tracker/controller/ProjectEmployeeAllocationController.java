package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.EmployeeDto;
import com.defect.tracker.data.dto.Project_EmpDto;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.ProjectEmployeeAllocationRepository;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.ProjectEmployeeAllocationService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class ProjectEmployeeAllocationController {

	@Autowired
	ProjectEmployeeAllocationRepository projectemployeeallocationRepository;
	
	@Autowired
	ProjectEmployeeAllocationService projectemployeeallocationService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;
	
	@DeleteMapping(value=EndpointURI.EMPLOYEE_DEALLOCATION_FOR_SUBMODULE)
	public ResponseEntity<Object> deleteEmployeeSubModule(@PathVariable Long id){
		if (!projectemployeeallocationService.isProjectempExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_EMPLOYEE_NOT_AVAILABLE,
					validationFailureStatusCodes.getProjectemployeeNotExists()), HttpStatus.BAD_REQUEST);
		}
		projectemployeeallocationService.DeleteProjectEmp(id);
		return new ResponseEntity<Object>(Constants.EMPLOYEE_DEALLOCATION_SUCCESS_TO_SUBMODULE, HttpStatus.OK);	
	}
	
	@GetMapping(value= EndpointURI.GETAPI_SUBMODULEALLOCATION )
	public ResponseEntity<Object> getAPISubmoduleAllocation(@PathVariable Long SubModuleId){
		if (!projectemployeeallocationService.isProjectEmployeeExistsByProjectId(SubModuleId)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_EMPTY,
					validationFailureStatusCodes.getEmployeeNotFound()), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Object>(mapper.map(projectemployeeallocationService.getAPISubmoduleAllocation(SubModuleId), Project_EmpDto.class), HttpStatus.OK);

	} 
	
	
}
