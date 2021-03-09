package com.defect.tracker.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.SubModuleDto;
import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.SubModuleService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class SubModuleController {
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	
	@Autowired
	SubModuleService subModuleService;

	
	@PutMapping(value= EndpointURI.UpdateSubModule)
	public ResponseEntity<Object> updateSubModule(@RequestBody SubModuleDto subModuleDto){
		SubModule submodule =  mapper.map(subModuleDto ,SubModule.class);
		subModuleService.Update(submodule);
		return new ResponseEntity<Object>(Constants.UpdateSubmodule, HttpStatus.OK);
		
	}
	
	@GetMapping(value = EndpointURI.getSubModule)
	public ResponseEntity<Object> getSubmodule(@PathVariable Long moduleId) {
		if (!subModuleService.existById(moduleId)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS,
					validationFailureStatusCodes.getModuleNotExist()), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Object>(mapper.map(subModuleService.findSubModule(moduleId), SubModuleDto.class), HttpStatus.OK);
		
	}
	@DeleteMapping(value= EndpointURI.SUBMODULE_DELETE)
	public ResponseEntity<Object> deleteSUbModule(@PathVariable Long id){
		if(!subModuleService.existsSubModule(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_DOES_NOT_EXISTS, 
					validationFailureStatusCodes.getSubModuleNotExist()), HttpStatus.BAD_REQUEST);
			}
		subModuleService.deleteSubModuleById(id);
		return new ResponseEntity<Object>(Constants.SUBMODULE_DELETED, HttpStatus.OK);
		
	}
	
	

}
