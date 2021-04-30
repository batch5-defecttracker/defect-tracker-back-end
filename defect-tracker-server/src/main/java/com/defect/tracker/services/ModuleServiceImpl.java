package com.defect.tracker.services;

import java.util.ArrayList;
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
	public boolean existByModuleName(String name) {
		return moduleRepository.existsByName(name);
	}

	@Override
	public List<Module> findAll() {
		return moduleRepository.findAll();
	}

	@Override
	public List<Module> findByProject(Long projectId) {
		return moduleRepository.findByProjectId(projectId);
	}

	@Override
	public boolean existsByProjectId(Long projectId) {
		return moduleRepository.existsByProjectId(projectId);
	}

	@Override
	public List<Long> getModIdByProId(Long id) {
		List<Long> lisOfModuleId = new ArrayList<Long>();
		List<Module> ListOfModule = moduleRepository.findByProjectId(id);
		for (Module module : ListOfModule) {
			lisOfModuleId.add(module.getId());
		}
		return lisOfModuleId;
	}

	@Override
	public boolean existByModuleNameAndProjectId(String name, Long projectId) {
		return moduleRepository.existsByProjectIdAndName(projectId, name);
	}

	@Override
	public Module getModuleById(Long id) {
		return moduleRepository.findById(id).get();
	}

}
