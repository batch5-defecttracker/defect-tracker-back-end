package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.ProjectEmp;

public interface ProjectEmployeeAllocationRepository extends JpaRepository<ProjectEmp,Long>{

}
