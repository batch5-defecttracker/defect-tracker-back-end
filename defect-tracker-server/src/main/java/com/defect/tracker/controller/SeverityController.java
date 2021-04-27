package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.services.SeverityService;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class SeverityController {
	@Autowired
	private SeverityService severityservice;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@GetMapping(value = EndpointURI.SEVERITY)
	public ResponseEntity<Object> getAllSeverity() {
		return new ResponseEntity<Object>(severityservice.getAllSeverity(), HttpStatus.OK);
	}
}
