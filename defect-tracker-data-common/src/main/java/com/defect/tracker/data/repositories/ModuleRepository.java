package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Long>{


	boolean existsByModuleName(String name);

}
