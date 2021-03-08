package com.defect.tracker.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.defect.tracker.data.dto.SubModuleDto;
import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.SubModuleRepository;
import com.defect.tracker.services.SubModuleService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;

@RestController
public class SubModuleController {
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	SubModuleRepository subModuleRepository;
	
	@Autowired
	SubModuleService subModuleService;


	
	@PutMapping(value= EndpointURI.UpdateSubModule)
	public ResponseEntity<Object> updateSubModule(@RequestBody SubModuleDto subModuleDto){
		SubModule submodule =  mapper.map(subModuleDto ,SubModule.class);
		subModuleService.Update(submodule);
		return new ResponseEntity<Object>(Constants.UpdateSubmodule, HttpStatus.OK);
		
	}
			
	
	

}
