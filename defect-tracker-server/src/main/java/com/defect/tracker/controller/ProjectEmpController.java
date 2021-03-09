package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.repositories.ProjectEmpRepository;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.ProjectEmpService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class ProjectEmpController {

	@Autowired
	ProjectEmpRepository projectempRepository;
	
	@Autowired
	ProjectEmpService projectempService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	
	@DeleteMapping(value=EndpointURI.DeallocateSubModule)
	public ResponseEntity<Object> deleteEmployeeSubModule(@PathVariable Long id){
		if (!projectempService.isProjectempExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_EMP_NOT_EXISTS,
					validationFailureStatusCodes.getModuleNotExist()), HttpStatus.BAD_REQUEST);
		}
		projectempService.DeleteProjectEmp(id);
		return new ResponseEntity<Object>(Constants.EMPLOYEE_DELETE_SubModule_SUCCESS, HttpStatus.OK);	
	}
	
}
