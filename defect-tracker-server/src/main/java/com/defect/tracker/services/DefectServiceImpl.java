package com.defect.tracker.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.entities.ProjectEmp;
import com.defect.tracker.data.repositories.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService {
	
	@Autowired
	private DefectRepository defectRepository;
	
	@Autowired
	DefectStatusService defectStatusService;
	
	@Autowired
	ProjectEmployeeAllocationService projectEmployeeAllocationService;

	@Autowired
	MailServiceImpl mailServiceImpl;
	
	@Autowired
	EmployeeService employeeService;
	
	
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

	@Override
	public Defect findById(Long id) {
		return defectRepository.findById(id).get() ;
	}
	
	public void dataCall(DefectDto defectDto) {
		String mail = findById(defectDto.getEmployeeId()).getEmployee().getEmail();
		String module = findById(defectDto.getModuleId()).getModule().getModuleName();
		String status = defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get()
				.getDefectStatusName();
		String assignedEmployee = employeeService.findById(defectDto.getEmployeeId()).get().getFirstName();
		String openedEmployee = findById(defectDto.getEmployee2Id()).getEmployee2().getFirstName();

		mailServiceImpl.sendEmail(mail, module, assignedEmployee, openedEmployee, status);
	}

	public void dataListCall(DefectDto defectDto) {
		List<String> mails = new ArrayList<>();
		List<String> names = new ArrayList<>();
		String module = findById(defectDto.getModuleId()).getModule().getModuleName();
		String status = defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get()
				.getDefectStatusName();
		String openedEmployee = findById(defectDto.getEmployee2Id()).getEmployee2().getFirstName();
		List<ProjectEmp> projectList = projectEmployeeAllocationService.findbyModule(defectDto.getModuleId());
		for (ProjectEmp projectEmp : projectList) {
			names.add(projectEmp.getEmployee().getFirstName());
		}
		for (ProjectEmp projectEmp : projectList) {
			mails.add(projectEmp.getEmployee().getEmail());
		}

		mailServiceImpl.sendListEmail(mails, module, names, openedEmployee, status);
	}

	
}
