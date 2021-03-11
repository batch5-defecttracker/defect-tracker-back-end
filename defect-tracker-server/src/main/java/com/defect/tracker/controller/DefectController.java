package com.defect.tracker.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.dto.DefectResponseDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.entities.DefectStatus;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.DefectStatusRepository;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DefectService;
import com.defect.tracker.services.DefectStatusService;
import com.defect.tracker.util.Constants;
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
	
	@Autowired
	DefectStatusRepository defectStatusRepository;
	
	@GetMapping(value = EndpointURI.DEFECT)
	public ResponseEntity<Object> findById(){
		if(defectService.getAllDefect().isEmpty()) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_DOES_NOT_EXISTS,
					validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(mapper.map(defectService.getAllDefect(), DefectResponseDto.class), HttpStatus.OK);	
	}
		
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

	
	@GetMapping(value = EndpointURI.DEFECT_GET_BY_ID)
	public ResponseEntity<Object> getDefectById(@PathVariable Long id){
		if(!defectService.isDefectExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_ID_NOT_EXISTS,
					validationFailureStatusCodes.getDefectNotExist()),HttpStatus.BAD_REQUEST);
		}
		DefectDto defectDto =  mapper.map(defectService.findById(id) , DefectDto.class);
		return new ResponseEntity<Object>(defectDto,HttpStatus.OK);
	}
	
	@PutMapping(value = EndpointURI.UPDATE_DEFECT_STATUS)
	public ResponseEntity<Object> updateDefectStatus(@PathVariable Long id , @PathVariable Long status){
		if(defectService.isDefectExists(id)){
				if(!defectStatusRepository.existsById(status)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_NOT_EXISTS,
					validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}
				}else {
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_NOT_EXISTS,
						validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}

		 Defect defect=defectService.findById(id);
		 DefectStatus ds=defectStatusRepository.getOne(status);
		 defect.setDefectStatus(ds);
		 defectService.addDefect(defect);
		return new ResponseEntity<Object>(Constants.UPDATE_DEFECT, HttpStatus.OK);
	}
	
}

