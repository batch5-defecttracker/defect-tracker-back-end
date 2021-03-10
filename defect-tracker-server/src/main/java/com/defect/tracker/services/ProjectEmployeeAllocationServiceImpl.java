package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.repositories.ProjectEmployeeAllocationRepository;

@Service
public class ProjectEmployeeAllocationServiceImpl implements ProjectEmployeeAllocationService{

	
	
	@Autowired
	ProjectEmployeeAllocationRepository projectemployeeallocationRepository;
	
	@Override
	public void DeleteProjectEmp(Long id) {
		projectemployeeallocationRepository.deleteById(id);
		
	}

	@Override
	public boolean isProjectempExists(Long id) {
		return projectemployeeallocationRepository.existsById(id) ;
	}

}
