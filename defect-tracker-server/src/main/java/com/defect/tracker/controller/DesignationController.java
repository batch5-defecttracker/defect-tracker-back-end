package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.DesignationDto;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.services.DesignationService;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class DesignationController {
	
	@Autowired
	private DesignationService designationService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	Mapper mapper;

	@GetMapping(value = EndpointURI.DESIGNATION)
	public ResponseEntity<Object> getAllDesignation() {
		return new ResponseEntity<Object>(mapper.map(designationService.getAlldesignation(), DesignationDto.class), HttpStatus.OK);
	}
}