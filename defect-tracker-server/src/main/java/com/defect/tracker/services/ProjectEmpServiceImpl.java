package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.repositories.ProjectEmpRepository;

@Service
public class ProjectEmpServiceImpl implements ProjectEmpService{

	
	
	@Autowired
	ProjectEmpRepository projectempRepository;
	
	@Override
	public void DeleteProjectEmp(Long id) {
		projectempRepository.deleteById(id);
		
	}

	@Override
	public boolean isProjectempExists(Long id) {
		return projectempRepository.existsById(id) ;
	}

}
