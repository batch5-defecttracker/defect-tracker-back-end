package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.repositories.ProjectEmployeeAllocationRepository;

@Service
public class ProjectEmployeeAllocationServicelmpl implements ProjectEmployeeAllocationService{
    
	@Autowired
	ProjectEmployeeAllocationRepository projectEmployeeAllocationRepository;
	
	@Override
	public void DeleteProjectEmp(Long id) {
		projectEmployeeAllocationRepository.deleteById(id);
	}

	@Override
	public boolean isProjectenpExists(Long id) {
		return projectEmployeeAllocationRepository.existsById(id);
	}
	

}
