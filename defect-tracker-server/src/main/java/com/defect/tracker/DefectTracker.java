package com.defect.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.defect.tracker.data.repositories.LoginRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = LoginRepository.class)
public class DefectTracker {

	public static void main(String[] args) {
		SpringApplication.run(DefectTracker.class, args);
	}

}
