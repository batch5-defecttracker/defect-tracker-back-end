package com.defect.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.entities.DefectType;
import com.defect.tracker.services.DefectTypeService;
import com.defect.tracker.util.EndpointURI;

@RestController
public class DefectTypeController {
	@Autowired
	DefectTypeService defectTypeService;
	
	@GetMapping(value=EndpointURI.DEFECTTYPE)
	public List<DefectType> getAllDefectType(){
		return defectTypeService.getAllDefectType();
		
	}

}
