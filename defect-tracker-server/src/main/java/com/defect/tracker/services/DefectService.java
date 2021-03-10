package com.defect.tracker.services;

import java.util.Optional;

import com.defect.tracker.data.entities.Defect;

public interface DefectService {

	public void addDefect(Defect defect);
	public boolean isDefectExists(Long id);
	public Optional <Defect> findById(Long id);
	
	
}
