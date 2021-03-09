package com.defect.tracker.services;
import org.springframework.stereotype.Service;
import com.defect.tracker.data.entities.SubModule;

@Service
public interface SubModuleService {
	
	public void Update(SubModule submodule);
	public void deleteSubModuleById(Long  id);
	public boolean existsSubModule(Long id);
	

	

}
