package com.defect.tracker.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.defect.tracker.data.entities.DefectStatus;
import com.defect.tracker.data.repositories.DefectStatusRepository;

@Service
public class DefectStatusServiceImpl implements DefectStatusService {

	@Autowired
	private DefectStatusRepository defectStatusRepository;

	@Override
	public List<DefectStatus> getAllDefectStatus() {
		return defectStatusRepository.findAll();
	}

	@Override
	public DefectStatus getDefectStatusByName(String name) {
		return defectStatusRepository.findByDefectStatusName(name);
	}

	@Override
	public Optional<DefectStatus> getDefectStatusById(Long id) {
		return defectStatusRepository.findById(id);
	}

	@Override
	public List<DefectStatus> addDropDownStatus(String fixed, String reject) {
		List<DefectStatus> defectStatusList = new ArrayList<>();
		defectStatusList.add(getDefectStatusByName(fixed));
		defectStatusList.add(getDefectStatusByName(reject));
		return defectStatusList;
	}

	@Override
	public boolean existById(Long id) {
		return defectStatusRepository.existsById(id);
	}
}