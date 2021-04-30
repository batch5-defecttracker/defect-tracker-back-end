package com.defect.tracker.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Login;

public interface LoginRepository extends JpaRepository<Login, String> {
	boolean existsByEmail(String email);

	List<Login> findByStatus(boolean status);

	Optional<Login> findByEmail(String email);

	List<Login> getByStatus(String status);

	Login findByToken(String token);

	boolean existsByStatus(boolean status);
	 
}
