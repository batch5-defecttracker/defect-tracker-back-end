package com.defect.tracker.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.repositories.EmployeeRepository;
import com.defect.tracker.data.repositories.SubModuleRepository;

@Service
public class SubModuleServiceImpl implements SubModuleService{

	@Autowired
	private SubModuleRepository subModuleUpdateRepository;
<<<<<<< HEAD
	
	
	
	
=======

>>>>>>> 3b1a46c5dfb1a2d245e5490d3514b687dbb1f1c7
	@Override
	public void Update(SubModule submodule) {
		subModuleUpdateRepository.save(submodule);	
	}

	@Override
	public List<SubModule> findSubModule(Long id) {
		return subModuleUpdateRepository.findByModuleId(id);
	}

	@Override
	public boolean existById(Long id) {
		return subModuleUpdateRepository.existsByModuleId(id);
	}
	public void deleteSubModuleById(Long id) {
		subModuleUpdateRepository.deleteById(id);
		
	}


<<<<<<< HEAD
	
=======
	@Override
	public boolean existsSubModule(Long id) {
		return subModuleUpdateRepository.existsById(id);
	}


>>>>>>> 3b1a46c5dfb1a2d245e5490d3514b687dbb1f1c7



	
	
	
	
}
