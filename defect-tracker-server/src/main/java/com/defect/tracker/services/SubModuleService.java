package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.SubModule;

public interface SubModuleService {
	public void deleteSubModuleById(Long id);

	public void addSubModule(SubModule subModule);

	public List<SubModule> findSubModule(Long id);

	public List<SubModule> findAllSubModule();

	public boolean existsSubModule(Long id);

	public boolean existsByModuleId(Long id);

	public boolean existsBySubModuleName(String name);

	public boolean existsBySubmoduleNameAndModuleId(String submoduleName, Long moduleId);
}
