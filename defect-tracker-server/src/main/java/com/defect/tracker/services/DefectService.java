package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Defect;


public interface DefectService {
	
	public List<Defect> getAllDefect();
	boolean isDefectAlreadyExist(Long id);
}
