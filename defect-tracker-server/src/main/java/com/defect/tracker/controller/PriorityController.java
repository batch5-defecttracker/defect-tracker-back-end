package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.services.PriorityService;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class PriorityController {

	@Autowired
	private PriorityService priorityService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	

	@GetMapping(value = EndpointURI.PRIORITY) 
	public ResponseEntity<Object> getAllPriority() {
		return new ResponseEntity<Object>(priorityService.getAllPriority(), HttpStatus.OK);
	}
}
