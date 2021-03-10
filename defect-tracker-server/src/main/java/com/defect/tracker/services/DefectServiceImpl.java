package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.repositories.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService {
	
	@Autowired
	private DefectRepository defectRepository;
	
	@Override
	public List<Defect> getAllDefect() {
		return defectRepository.findAll() ;
	}

	@Override
	public boolean isDefectAlreadyExist(Long id) {
		
		return defectRepository.existsById(id);
	}


	@Override
	public void addDefect(Defect defect) {
		defectRepository.save(defect);
		
	}

	@Override
	public boolean isDefectExists(Long id) {
		return defectRepository.existsById(id);
	}

	
}
