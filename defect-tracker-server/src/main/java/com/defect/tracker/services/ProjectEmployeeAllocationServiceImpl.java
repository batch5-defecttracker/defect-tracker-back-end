package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.ProjectEmp;
import com.defect.tracker.data.repositories.ProjectEmployeeAllocationRepository;

@Service
public class ProjectEmployeeAllocationServiceImpl implements ProjectEmployeeAllocationService {
	@Autowired
	ProjectEmployeeAllocationRepository projectemployeeallocationRepository;

	@Override
	public void deAllocateProject(Long id) {
//		projectemployeeallocationRepository.deleteById(id);
		projectemployeeallocationRepository
				.deleteById(projectemployeeallocationRepository.findByEmployeeId(id).getId());
	}

	@Override
	public boolean existsByid(Long id) {
		return projectemployeeallocationRepository.existsById(id);
	}

	@Override
	public void addProjectAllocation(ProjectEmp projectEmp) {
		projectemployeeallocationRepository.save(projectEmp);
	}

	@Override
	public List<ProjectEmp> getAll() {
		return projectemployeeallocationRepository.findAll();
	}

	@Override
	public void update(ProjectEmp projectEmp) {
		projectemployeeallocationRepository.save(projectEmp);
	}

	@Override
	public List<ProjectEmp> getEmployeeByModule(Long moduleId) {
		return projectemployeeallocationRepository.findEmployeeByModuleId(moduleId);
	}

	@Override
	public boolean existsByModuleId(Long moduleId) {
		return projectemployeeallocationRepository.existsByModuleId(moduleId);
	}

	public List<ProjectEmp> findbyModule(Long id) {
		return projectemployeeallocationRepository.findByModuleId(id);
	}

	@Override
	public boolean existsByEmployeeIdAndProjectId(Long eId, Long pId) {
		return projectemployeeallocationRepository.existsByEmployeeIdAndProjectId(eId, pId);
	}

	@Override
	public boolean existsBySubmoduleId(Long id) {
		return projectemployeeallocationRepository.existsBySubmoduleId(id);
	}

	@Override
	public boolean existsByEmployeeId(Long id) {
		return projectemployeeallocationRepository.existsByEmployeeId(id);
	}

	@Override
	public boolean existsByEmployeeIdAndModuleIdId(Long assignedToId, Long moduleId) {
		return projectemployeeallocationRepository.existsByEmployeeIdAndModuleId(assignedToId, moduleId);
	}

}
