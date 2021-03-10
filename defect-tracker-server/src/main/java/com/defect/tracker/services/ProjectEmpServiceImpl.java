package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.ProjectEmp;
import com.defect.tracker.data.repositories.ProjectEmpRepository;

@Service
public class ProjectEmpServiceImpl implements ProjectEmpService{
	
	@Autowired
	ProjectEmpRepository projectEmpRepository;

	@Override
	public void deAllocateProject(Long id) {
		projectEmpRepository.deleteById(id);
		
	}

	@Override
	public boolean existsByid(Long id) {
		
		return projectEmpRepository.existsById(id);
	}

	@Override
	public void addProjectAllocation(ProjectEmp projectEmp) {
		projectEmpRepository.save(projectEmp);
		
	}

	@Override
	public List<ProjectEmp> getAll() {
		
		return projectEmpRepository.findAll();
	}

}
