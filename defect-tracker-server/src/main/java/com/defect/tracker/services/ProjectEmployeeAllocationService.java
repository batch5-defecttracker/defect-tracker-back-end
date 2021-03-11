package com.defect.tracker.services;
import java.util.List;

import com.defect.tracker.data.entities.ProjectEmp;

public interface ProjectEmployeeAllocationService {

	public void deAllocateProject(Long id);
	boolean existsByid(Long id);
	public void addProjectAllocation(ProjectEmp projectEmp);
	public List<ProjectEmp> getAll();
	public List<ProjectEmp> getAllModuleAllocations();
	//public boolean isModuleNotExist(String name);

}
