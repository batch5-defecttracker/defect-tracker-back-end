package com.defect.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.DefectTypeDto;
import com.defect.tracker.data.entities.DefectType;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.services.DefectTypeService;
import com.defect.tracker.util.EndpointURI;

@RestController
public class DefectTypeController {
	@Autowired
	DefectTypeService defectTypeService;
	
	@Autowired
	private Mapper mapper;
	
	@GetMapping(value=EndpointURI.DEFECTTYPE)
	public List<DefectType> getAllDefectType(DefectTypeDto defectTypeDto){
		DefectType defectType = mapper.map(defectTypeDto, DefectType.class);
		return defectTypeService.getAllDefectType(defectType);
		
	}

}
