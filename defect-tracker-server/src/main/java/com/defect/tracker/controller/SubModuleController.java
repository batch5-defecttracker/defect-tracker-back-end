package com.defect.tracker.controller;

import javax.validation.Valid;

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

import com.defect.tracker.data.dto.SubModuleDto;
import com.defect.tracker.data.dto.SubModuleResponseDto;
import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.SubModuleRepository;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.ModuleService;
import com.defect.tracker.services.SubModuleService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class SubModuleController {
	@Autowired
	ModuleService moduleService;
	@Autowired
	Mapper mapper;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	SubModuleService subModuleService;
	@Autowired
	SubModuleRepository subModuleRepository;

	@PostMapping(value = EndpointURI.SUBMODULE)
	public ResponseEntity<Object> createSubModule(@Valid @RequestBody SubModuleDto subModuleDto) {
		if (!moduleService.isModuleExists(subModuleDto.getModuleId())) {
			return new ResponseEntity<Object>(new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS,
					validationFailureStatusCodes.getSubModuleAlreadyExist()), HttpStatus.BAD_REQUEST);
		}
		if (subModuleService.existsBySubmoduleNameAndModuleId(subModuleDto.getName(), subModuleDto.getModuleId())) {
			return new ResponseEntity<Object>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_ALREADY_EXIST,
					validationFailureStatusCodes.getSubModuleAlreadyExist()), HttpStatus.BAD_REQUEST);
		}
		SubModule subModule = mapper.map(subModuleDto, SubModule.class);
		subModuleService.addSubModule(subModule);
		return new ResponseEntity<Object>(Constants.SUBMODULE_ADDED, HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.SUBMODULE_BY_ID)
	public ResponseEntity<Object> getSubmodule(@PathVariable Long moduleId) {
		if (!subModuleService.existsSubModule(moduleId)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUB_MODULE_NOT_EXISTS,
					validationFailureStatusCodes.getModuleNotExist()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(mapper.map(subModuleService.findSubModule(moduleId), SubModuleDto.class),
				HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.SUBMODULE)
	public ResponseEntity<Object> findAllSubModule() {
		return new ResponseEntity<Object>(mapper.map(subModuleService.findAllSubModule(), SubModuleResponseDto.class),
				HttpStatus.OK);
	}

	@PutMapping(value = EndpointURI.SUBMODULE)
	public ResponseEntity<Object> updateSubModule(@Valid @RequestBody SubModuleDto subModuleDto) {
		if (!subModuleService.existsSubModule(subModuleDto.getId())) {
			return new ResponseEntity<Object>(new ValidationFailureResponse(ValidationConstance.SUB_MODULE_NOT_EXISTS,
					validationFailureStatusCodes.getSubModuleAlreadyExist()), HttpStatus.BAD_REQUEST);
		}
		SubModule submodule = mapper.map(subModuleDto, SubModule.class);
		subModuleService.addSubModule(submodule);
		return new ResponseEntity<Object>(Constants.UPDATE_SUBMODULE, HttpStatus.OK);
	}

	@DeleteMapping(value = EndpointURI.SUBMODULE_BY_ID)
	public ResponseEntity<Object> deleteSUbModule(@PathVariable Long id) {
		if (!subModuleService.existsSubModule(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_DOES_NOT_EXISTS,
					validationFailureStatusCodes.getSubModuleNotExist()), HttpStatus.BAD_REQUEST);
		}
		subModuleService.deleteSubModuleById(id);
		return new ResponseEntity<Object>(Constants.SUBMODULE_DELETED, HttpStatus.OK);
	}
}
