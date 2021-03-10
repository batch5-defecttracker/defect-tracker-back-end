package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DefectService;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;



@RestController
public class DefectController {
	
	@Autowired
	DefectService defectService;
	
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	
	@Autowired
	private Mapper mapper;
	
	@GetMapping(value = EndpointURI.DEFECT)
	public ResponseEntity<Object> findById(){
		if(defectService.getAllDefect().isEmpty()) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_DOES_NOT_EXISTS,
					validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(mapper.map(defectService.getAllDefect(), DefectDto.class), HttpStatus.OK);	
	}
}
