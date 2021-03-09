package com.defect.tracker.data.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	boolean existsByEmail(String email);
	
	
	
}
