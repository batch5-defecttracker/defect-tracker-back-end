package com.defect.tracker.services;

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

	@Override
	public boolean isProNameAlreadyExist(String proName) {
			return projectRepository.existsByprojectName(proName);
	}

	//@Override
	//public Optional<Project> findById(Long id) {
		// TODO Auto-generated method stub
		//return null;
	//}

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
	public Project findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		
	}
	

	

}
