package com.defect.tracker.services;

import java.util.List;
import com.defect.tracker.data.entities.SubModule;


public interface SubModuleService {

	
	public void createSubModule(SubModule subModule);
	public List<SubModule> findSubModule(Long id);
	public List<SubModule> findAllSubModule();
	public void Update(SubModule submodule);
	public void deleteSubModuleById(Long  id);
	
	
	public boolean existById(Long id);
	public boolean existsSubModule(Long id);
	public boolean existsByModuleId(Long id);
<<<<<<< HEAD
	public boolean existsBySubModuleName(String name); 
	
		
=======
	public boolean existsBySubModuleName(String name);
>>>>>>> 5761fe56ad3191b3be723df4515fcaa3a850792e
}

