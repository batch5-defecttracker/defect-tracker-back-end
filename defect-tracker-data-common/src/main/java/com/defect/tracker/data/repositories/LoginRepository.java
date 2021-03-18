package com.defect.tracker.data.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.defect.tracker.data.entities.Login;


public interface LoginRepository extends JpaRepository<Login, String> {

	List<Login> findByStatus(String status);

	Optional<Login> findByEmail(String email);
}
