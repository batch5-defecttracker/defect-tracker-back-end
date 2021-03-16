package com.defect.tracker.data.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.defect.tracker.data.entities.ProjectEmp;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectEmployeeAllocationRepository extends JpaRepository<ProjectEmp, Long> {

	//List<ProjectEmp> findByModuleId(Long moduleId);
	boolean existsByModuleId(Long moduleId);
	List<ProjectEmp> findEmployeeByModuleId(Long moduleId);

	/* public boolean existsByName(String name) */;
}
