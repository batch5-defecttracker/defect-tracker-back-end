package com.defect.tracker.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.defect.tracker.data.entities.Login;


public interface LoginRepository extends JpaRepository<Login, String> {
	
	List<Login> getByStatus(String status);
	Login findByEmail(String email);

	Login findByToken(String token); 

	List<Login> findByStatus(String status);
}
