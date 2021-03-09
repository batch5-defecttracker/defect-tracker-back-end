package com.defect.tracker.services;
import java.util.Optional;
import com.defect.tracker.data.entities.Project;
public interface ProjectService {

	public Project findById(Long id);
	public boolean existProject(Long id);
	public void deleteById(Long id);
	public boolean isProNameAlreadyExist(String proName);
	public void createProject(Project project);
	
	public void updateProject(Project project);

}
