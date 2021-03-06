package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.defect.tracker.data.dto.ModuleDto;
import com.defect.tracker.data.entities.Module;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.ModuleService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@Controller
public class ModuleController {

	@Autowired
	ModuleService moduleService;

	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	
	@Autowired
	private Mapper mapper;

	@DeleteMapping(value = EndpointURI.MODULE_DELETE)
	public ResponseEntity<Object> deleteModule(@PathVariable Long id) {
		if (!moduleService.isModuleExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS,
					validationFailureStatusCodes.getModuleNotExist()), HttpStatus.BAD_REQUEST);
		}
		moduleService.deleteModule(id);
		return new ResponseEntity<Object>(Constants.MODULE_DELETE_SUCCESS, HttpStatus.OK);
	}
	
	@PostMapping(value = EndpointURI.MODULE_ADD)
	public ResponseEntity<Object> addModule(@RequestBody ModuleDto moduleDto) {
		if (moduleService.isModuleExistsByName(moduleDto.getModuleName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_EXISTS,
					validationFailureStatusCodes.getModuleAlreadyExist()), HttpStatus.BAD_REQUEST);
		}
		Module module = mapper.map(moduleDto, Module.class);
		moduleService.addModule(module);
		return new ResponseEntity<Object>(Constants.MODULE_ADD_SUCCESS, HttpStatus.OK);
	}
}
