package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.ProjectDto;
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
	ProjectService  projectService;
	
	
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value= EndpointURI.PROJECT)
	public ResponseEntity<Object> addProject(@RequestBody ProjectDto proDto){
		
		  if(projectService.isProNameAlreadyExist(proDto.getProjectName())) { return
		  new ResponseEntity<>(new
		  ValidationFailureResponse(ValidationConstance.PROJECT_EXISTS,
		  validationFailureStatusCodes.getProNameAlreadyExists()),
		  HttpStatus.BAD_REQUEST); }
		 
		
		Project project = mapper.map(proDto, Project.class);
		projectService.createProject(project);
		return new ResponseEntity<Object>(Constants.PROJECT_ADDED_SUCCESS,HttpStatus.OK);
		
	}
	
	
	@GetMapping(value = EndpointURI.PROJECT_FIND)
	public ResponseEntity<Object> findById(@PathVariable Long id){
		if(!projectService.existProject(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_DOES_NOT_EXISTS,
					validationFailureStatusCodes.getProjectNotExist()), HttpStatus.BAD_REQUEST);
		} 
		return new ResponseEntity<Object>(mapper.map(projectService.findById(id), ProjectDto.class), HttpStatus.OK);	
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
	
	@PutMapping(value = EndpointURI.UPDATE_PROJECT)
	public ResponseEntity<Object> updateProject(@RequestBody ProjectDto projectDto) {
		if (projectService.isProNameAlreadyExist(projectDto.getProjectName())) {
			if (!projectService.existProject(projectDto.getId())) {
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_DOES_NOT_EXISTS,
						validationFailureStatusCodes.getProjectNotExist()), HttpStatus.BAD_REQUEST);
			}
			
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NAME_EXISTS,
					validationFailureStatusCodes.getProNameAlreadyExists()), HttpStatus.BAD_REQUEST);
		}

		Project project = mapper.map(projectDto, Project.class);
		projectService.updateProject(project);
		return new ResponseEntity<Object>(Constants.PROJECT_UPDATED, HttpStatus.OK);
	}

}
