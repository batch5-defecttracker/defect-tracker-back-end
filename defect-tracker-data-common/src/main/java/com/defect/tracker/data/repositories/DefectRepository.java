package com.defect.tracker.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.defect.tracker.data.entities.Defect;

public interface DefectRepository extends JpaRepository<Defect, Long> {
	public List<Defect> findByDefectStatusId(Long sid);

	public List<Defect> findByEmployee2IdAndDefectStatusId(Long id, Long sid);

	public List<Defect> findByModuleIdAndDefectStatusId(Long id, Long sid);
	
	
	@Query ("select d from Defect d where "
			+ "CONCAT(d.defectDescription , d.file , d.str , d.defectStatus , d.defectType , d.severity , d.priority , d.employee2 , d.employee , d.submodule , d.module)"
			+ " Like %?1%")
	public List<Defect> findAll(String keyword);
}
