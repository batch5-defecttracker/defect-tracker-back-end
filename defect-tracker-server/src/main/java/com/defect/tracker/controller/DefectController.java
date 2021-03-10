package com.defect.tracker.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DefectService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@Controller
public class DefectController {
	
	@Autowired
	DefectService defectService;
	
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value = EndpointURI.DEFECT_ADD)
	public ResponseEntity<Object> addDefect(@RequestBody DefectDto defectDto) {
		java.sql.Date date = new Date(System.currentTimeMillis());
		defectDto.setTimeStamp(date);
		Defect defect = mapper.map(defectDto, Defect.class);
		defectService.addDefect(defect);
		return new ResponseEntity<Object>(Constants.DEFECT_ADD_SUCCESS, HttpStatus.OK);
	}
	
	@PutMapping(value= EndpointURI.DEFECT_UPDATE)
	public ResponseEntity<Object> updateDefect(@RequestBody DefectDto defectDto){
		if(!defectService.isDefectExists(defectDto.getId())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_NOT_EXISTS,
					validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}
		Defect defect =  mapper.map(defectDto , Defect.class);
		defectService.addDefect(defect);
		return new ResponseEntity<Object>(Constants.UPDATE_DEFECT, HttpStatus.OK);
		
	}
}
