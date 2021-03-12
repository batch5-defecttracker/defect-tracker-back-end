package com.defect.tracker.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.defect.tracker.data.entities.Project;
import com.defect.tracker.data.repositories.ProjectRepository;


public class ProjectSerImple  implements ProjectService{
	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public void createProject(Project project) {
		projectRepository.save(project);
		
	}
	/*
	 * @Override public boolean isProNameAlreadyExist(String proName) { return
	 * projectRepository.existsByproName(proName); }
	 */

	@Override
	public Project findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existProject(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Override public boolean isProNameAlreadyExist(String proName) { // TODO
	 * Auto-generated method stub return false; }
	 */

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isProNameAlreadyExist(String proName) {
		// TODO Auto-generated method stub
		return false;
	}
	

	

}
