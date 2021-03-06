package com.defect.tracker.services;

import com.defect.tracker.data.entities.Module;

public interface ModuleService {

	public void deleteModule(Long id);

	public boolean isModuleExists(Long id);
	
	public void addModule(Module module);
	
	public boolean isModuleExistsByName(String name);

}
