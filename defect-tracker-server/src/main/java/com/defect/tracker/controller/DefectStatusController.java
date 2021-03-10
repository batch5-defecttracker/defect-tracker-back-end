package com.defect.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.entities.DefectStatus;
import com.defect.tracker.services.DefectStatusService;
import com.defect.tracker.util.EndpointURI;


@RestController
public class DefectStatusController {
	
	@Autowired
	private DefectStatusService defectStatusService;
	
	@GetMapping(value = EndpointURI.DEFECTSTATUS)
	public List<DefectStatus> getAllDefectStatus(){
		return defectStatusService.getAllDefectStatus();
		
	}
	
	
}
