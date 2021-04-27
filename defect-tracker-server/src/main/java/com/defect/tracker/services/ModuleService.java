package com.defect.tracker.services;

import java.util.List;
import com.defect.tracker.data.entities.Module;

public interface ModuleService {
	public void deleteModule(Long id);
	public void addModule(Module module);
	public boolean isModuleExists(Long id);
	public boolean existByModuleName(String name);
	public boolean existsByProjectId(Long projectId);
	public boolean existByModuleNameAndProjectId(String name, Long projectId);
	public List<Module> findAll();
	public List<Module> findByProject(Long projectId);
	public List<Long> getModIdByProId(Long id);
	public Module findById(Long id);
	
}