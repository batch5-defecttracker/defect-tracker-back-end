package com.defect.tracker.data.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.defect.tracker.data.entities.ProjectEmp;

@Repository
public interface ProjectEmployeeAllocationRepository extends JpaRepository<ProjectEmp, Long> {
	boolean existsByModuleId(Long moduleId);
	boolean existsByEmployeeId(Long id);
	boolean existsBySubmoduleId(Long id);
	List<ProjectEmp> findEmployeeByModuleId(Long moduleId);
	public List<ProjectEmp> findByModuleId(Long id);
	public ProjectEmp findByEmployeeId(Long id);
	boolean existsByEmployeeIdAndProjectId(Long eId, Long pId);
	boolean existsByEmployeeIdAndModuleId(Long assignedToId, Long moduleId2);
}
