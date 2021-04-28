package com.defect.tracker.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {
	public List<Module> findByProjectId(Long projectId);
	boolean existsByName(String name);
	boolean existsByProjectId(Long projectId);
	boolean existsByProjectIdAndName(Long projectId, String name);
}
