package com.defect.tracker.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Project;

public interface ProjectService {

	public Optional<Project> findById(Long id);
	public boolean existProject(Long id);
	public void deleteById(Long id);
	public boolean isProNameAlreadyExist(String proName);
	public void createProject(Project project);

}
