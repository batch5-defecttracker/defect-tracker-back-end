package com.defect.tracker.services;
import java.util.List;


import com.defect.tracker.data.entities.SubModule;


public interface SubModuleService {
	
	public void Update(SubModule submodule);
	public List<SubModule> findSubModule(Long id);
	public boolean existById(Long id);
	public void deleteSubModuleById(Long  id);
	public boolean existsSubModule(Long id);
	public void createSubModule(SubModule subModule);
	public boolean isSubModuleExistsByName(String name);
	

	

}
