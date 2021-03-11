package com.defect.tracker.data.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.defect.tracker.data.entities.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

	List<Login> findByStatus(String status);
	
//	List<Login> findByEmployee(Login login);

}
