package com.defect.tracker.services;
import org.springframework.stereotype.Service;
import com.defect.tracker.data.entities.Project;


@Service
public interface ProjectService {
	public void createProject(Project project);
	public boolean isProNameAlreadyExist(String proName);
}
