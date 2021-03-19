package com.defect.tracker.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.dto.DefectByProjectIdDto;
import com.defect.tracker.data.dto.DefectByEmployeeIdDto;
import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.entities.DefectStatus;
import com.defect.tracker.data.entities.ProjectEmp;
import com.defect.tracker.data.repositories.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService {
	@Autowired
	ModuleService moduleService;
	
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

	@Override
	public List<DefectByEmployeeIdDto> getByEmpIdAndStatus(Long empId) {
		List<DefectByEmployeeIdDto> ListOfDefect=new ArrayList<>();
		
		for (DefectStatus defectStatus :defectStatusService.getAllDefectStatus()) {
			DefectByEmployeeIdDto defectAssignDto=new DefectByEmployeeIdDto();
			defectAssignDto.setStatus(defectStatus.getDefectStatusName());
			defectAssignDto.setCount(defectRepository.findByEmployee2IdAndDefectStatusId(empId,defectStatus.getId()).size());
			ListOfDefect.add(defectAssignDto);
		}
		
		return ListOfDefect;
		
	}

	@Override
	public DefectByProjectIdDto getAllDefectByProId(Long proId) {
		DefectByProjectIdDto defecProjectByIdDto=new DefectByProjectIdDto();
		List<DefectByEmployeeIdDto> ListOfDefect=new ArrayList<>();
		
		int total=0;
		
		for (DefectStatus defectStatus : defectStatusService.getAllDefectStatus()) {
			DefectByEmployeeIdDto defectAssignDto=new DefectByEmployeeIdDto();
		
		int count = 0;
		
		for (Long modId : moduleService.getModIdByProId(proId)) {
		count=count +	defectRepository.findByModuleIdAndDefectStatusId(modId,defectStatus.getId()).size();	
		total=total+count;
		
			}	
		
		defectAssignDto.setStatus(defectStatus.getDefectStatusName());
		defectAssignDto.setCount(count); 
		ListOfDefect.add(defectAssignDto);	
		
		}
		
		defecProjectByIdDto.setDefectAssignDto(ListOfDefect);
		defecProjectByIdDto.setTotal(total);
		return defecProjectByIdDto;
	}
	
}
