package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.ProjectEmp;

public interface ProjectEmployeeAllocationService {
	
	public void DeleteProjectEmp(Long id);
	public boolean isProjectempExists(Long id);
	public List<ProjectEmp> getAPISubmoduleAllocation(Long SubModuleId);
    public boolean isProjectEmployeeExistsByProjectId(Long SubModuleId);
	
	

}
