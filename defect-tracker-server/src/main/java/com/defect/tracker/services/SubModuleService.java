package com.defect.tracker.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.SubModule;

@Service
public interface SubModuleService {
	
	public void Update(SubModule submodule);
	public List<SubModule> findSubModule(Long id);
	public boolean existById(Long id);
}
