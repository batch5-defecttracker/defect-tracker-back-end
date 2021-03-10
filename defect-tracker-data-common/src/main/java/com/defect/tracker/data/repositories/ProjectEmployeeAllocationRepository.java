package com.defect.tracker.data.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.defect.tracker.data.entities.ProjectEmp;

public interface ProjectEmployeeAllocationRepository extends JpaRepository<ProjectEmp,Long> {

	public List<ProjectEmp>findBySubModuleId(Long SubModuleId);
	boolean existsBySubModuleId(Long SubModuleId);
}
