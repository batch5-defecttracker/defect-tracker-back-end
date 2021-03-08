package com.defect.tracker.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.ProjectDto;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.entities.Project;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.ProjectService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@Autowired
	private Mapper mapper;
	
	@GetMapping(value = EndpointURI.PROJECT_FIND)
	public ResponseEntity<Object> findById(@PathVariable Long id){
		if(!projectService.existProject(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_DOES_NOT_EXISTS,
					validationFailureStatusCodes.getProjectNotExist()), HttpStatus.BAD_REQUEST);
		}
		
		//projectService.findById(id);
		return new ResponseEntity<Object>(projectService.findById(id), HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = EndpointURI.PROJECT_DELETE)
	public ResponseEntity<Object> deleteById(@PathVariable Long id){
		if(!projectService.existProject(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_DOES_NOT_EXISTS,
					validationFailureStatusCodes.getProjectNotExist()), HttpStatus.BAD_REQUEST);
		}
		
		projectService.deleteById(id);
		return new ResponseEntity<Object>(Constants.PROJECT_DELETED, HttpStatus.OK);
		
	}
}
