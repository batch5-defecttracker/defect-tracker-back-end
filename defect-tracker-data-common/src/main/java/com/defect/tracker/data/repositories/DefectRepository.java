package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Defect;

public interface DefectRepository extends JpaRepository<Defect, Long> {

}
