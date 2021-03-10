package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Module;
import com.defect.tracker.data.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public void deleteModule(Long id) {
		moduleRepository.deleteById(id);
		
	}

	@Override
	public boolean isModuleExists(Long id) {
		return moduleRepository.existsById(id);
	}

	@Override
	public void addModule(Module module) {
		moduleRepository.save(module);
		
	}

	@Override
	public boolean isModuleExistsByName(String name) {
		return moduleRepository.existsByModuleName(name);
	}

	@Override
	public List<Module> findAll() {
		return moduleRepository.findAll();
	}
	
	
}
