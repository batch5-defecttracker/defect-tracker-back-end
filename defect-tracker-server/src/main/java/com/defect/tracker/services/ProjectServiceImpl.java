package com.defect.tracker.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Project;
import com.defect.tracker.data.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Optional<Project> findById(Long id) {
		
		return projectRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		projectRepository.deleteById(id);
		
	}

	@Override
	public boolean existProject(Long id) {

		return projectRepository.existsById(id);
	}

	@Override
	public boolean isProNameAlreadyExist(String proName) {
		return projectRepository.existsByproName(proName);
	}

	@Override
	public void createProject(Project project) {
		projectRepository.save(project);
		
	}

}
