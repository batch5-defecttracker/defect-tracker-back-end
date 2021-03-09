package com.defect.tracker.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.repositories.EmployeeRepository;
import com.defect.tracker.data.repositories.SubModuleRepository;

@Service
public class SubModuleServiceImpl implements SubModuleService{

	@Autowired
	private SubModuleRepository subModuleUpdateRepository;
	
	
	
	
	@Override
	public void Update(SubModule submodule) {
		subModuleUpdateRepository.save(submodule);
		
	}


	



	
	
	
	
}
