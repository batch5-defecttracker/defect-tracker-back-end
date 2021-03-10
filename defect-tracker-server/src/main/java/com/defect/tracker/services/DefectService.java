package com.defect.tracker.services;

import com.defect.tracker.data.entities.Defect;

public interface DefectService {

	public void addDefect(Defect defect);
	
	public boolean isDefectExists(Long id);
}
