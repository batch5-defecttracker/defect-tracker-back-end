package com.defect.tracker.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Login;

public interface LoginRepository extends JpaRepository<Login, String> {
	boolean existsByEmail(String email);
	boolean existsByStatus(String status);
	List<Login> findByStatus(String status);
	Optional<Login> findByEmail(String email);
	List<Login> getByStatus(String status);
	Login findByToken(String token);
}
