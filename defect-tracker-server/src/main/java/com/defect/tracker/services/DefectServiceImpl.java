package com.defect.tracker.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.defect.tracker.data.dto.DefectByEmployeeIdDto;
import com.defect.tracker.data.dto.DefectByProjectIdDto;
import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.entities.DefectStatus;
import com.defect.tracker.data.entities.ProjectEmp;
import com.defect.tracker.data.repositories.DefectRepository;
import com.defect.tracker.data.repositories.ModuleRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DefectServiceImpl implements DefectService {
	private static final String UPLOAD_FOLDER = "src\\main\\resources\\file\\";

	@Autowired
	ModuleService moduleService;
	@Autowired
	private DefectRepository defectRepository;
	@Autowired
	DefectStatusService defectStatusService;
	@Autowired
	ProjectEmployeeAllocationService projectEmployeeAllocationService;
	@Autowired
	ModuleRepository moduleRepository;
	@Autowired
	MailServiceImpl mailServiceImpl;
	@Autowired
	EmployeeService employeeService;

	@Override
	public List<Defect> getAllDefect() {
		return defectRepository.findAll();
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
	public Optional<Defect> findById(Long id) {
		return defectRepository.findById(id);
	}

	public void dataPassForMail(DefectDto defectDto) {
		String mail = employeeService.findById(defectDto.getAssignedById()).get().getEmail();
		String module = moduleRepository.getOne(defectDto.getModuleId()).getName();
		String project=moduleService.getModuleById(defectDto.getModuleId()).getProject().getName();
		String status = defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get()
				.getDefectStatusName();
		String assignedEmployee = employeeService.findById(defectDto.getAssignedById()).get().getFirstName();
		String openedEmployee = employeeService.findById(defectDto.getAssignedToId()).get().getFirstName();

		mailServiceImpl.sendEmail(mail, module,project, assignedEmployee, openedEmployee, status);
	}
	
	public void defectUpdateQA(DefectDto defectDto) {
		String mail = employeeService.findById(defectDto.getAssignedById()).get().getEmail();
		String module = moduleRepository.getOne(defectDto.getModuleId()).getName();
		
		String assignedEmployee = employeeService.findById(defectDto.getAssignedById()).get().getFirstName();
		
		mailServiceImpl.sendEmailQA(mail, module, assignedEmployee);
	}

	public void dataPassForListMail(DefectDto defectDto) {
		List<String> mails = new ArrayList<>();
		List<String> names = new ArrayList<>();
		String module = moduleRepository.getOne(defectDto.getModuleId()).getName();
		String status = defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get()
				.getDefectStatusName();
		String asignedByEmployee = employeeService.findById(defectDto.getAssignedById()).get().getFirstName();
		List<ProjectEmp> projectList = projectEmployeeAllocationService.findbyModule(defectDto.getModuleId());
		for (ProjectEmp projectEmp : projectList) {
			names.add(projectEmp.getEmployee().getFirstName());
		}
		for (ProjectEmp projectEmp : projectList) {
			mails.add(projectEmp.getEmployee().getEmail());
		}

		mailServiceImpl.sendListEmail(mails, module, names, asignedByEmployee, status);
	}
	
	public void defectUpdateDV(DefectDto defectDto) {
		List<String> mails = new ArrayList<>();
		List<String> names = new ArrayList<>();
		String module = moduleRepository.getOne(defectDto.getModuleId()).getName();
		List<ProjectEmp> projectList = projectEmployeeAllocationService.findbyModule(defectDto.getModuleId());
		
		for (ProjectEmp projectEmp : projectList) {
			names.add(projectEmp.getEmployee().getFirstName());
		}
		for (ProjectEmp projectEmp : projectList) {
			mails.add(projectEmp.getEmployee().getEmail());
		}

		mailServiceImpl.sendListEmailDV(mails, module, names);
	}

	public void dataPassForAddDefect(DefectDto defectDto) {
		List<String> mails = new ArrayList<>();
		List<String> names = new ArrayList<>();
		String module = moduleRepository.getOne(defectDto.getModuleId()).getName();
		String assignedEmployee = employeeService.findById(defectDto.getAssignedById()).get().getFirstName();
		String status = "New";
		List<ProjectEmp> projectList = projectEmployeeAllocationService.findbyModule(defectDto.getModuleId());
		for (ProjectEmp projectEmp : projectList) {
			names.add(projectEmp.getEmployee().getFirstName());
		}
		for (ProjectEmp projectEmp : projectList) {
			mails.add(projectEmp.getEmployee().getEmail());
		}
		mailServiceImpl.sendListEmailNew(mails, module, names, assignedEmployee, status);
	}

	@Override
	public List<DefectByEmployeeIdDto> getByEmpIdAndStatus(Long empId) {
		List<DefectByEmployeeIdDto> ListOfDefect = new ArrayList<>();

		for (DefectStatus defectStatus : defectStatusService.getAllDefectStatus()) {
			DefectByEmployeeIdDto defectAssignDto = new DefectByEmployeeIdDto();
			defectAssignDto.setStatus(defectStatus.getDefectStatusName());
			defectAssignDto
					.setCount(defectRepository.findByAssignedToIdAndDefectStatusId(empId, defectStatus.getId()).size());
			ListOfDefect.add(defectAssignDto);
		}

		return ListOfDefect;
	}

	@Override
	public DefectByProjectIdDto getAllDefectByProId(Long proId) {
		DefectByProjectIdDto defecProjectByIdDto = new DefectByProjectIdDto();
		List<DefectByEmployeeIdDto> ListOfDefect = new ArrayList<>();

		int total = 0;

		for (DefectStatus defectStatus : defectStatusService.getAllDefectStatus()) {
			DefectByEmployeeIdDto defectAssignDto = new DefectByEmployeeIdDto();

			int count = 0;

			for (Long modId : moduleService.getModIdByProId(proId)) {
				count = count + defectRepository.findByModuleIdAndDefectStatusId(modId, defectStatus.getId()).size();
				total = total + count;

			}

			defectAssignDto.setStatus(defectStatus.getDefectStatusName());
			defectAssignDto.setCount(count);
			ListOfDefect.add(defectAssignDto);

		}

		defecProjectByIdDto.setDefectAssignDto(ListOfDefect);
		defecProjectByIdDto.setTotal(total);
		return defecProjectByIdDto;
	}

	public String fileUpload(MultipartFile file)  {
			try {
				byte[] data;
				data = file.getBytes();
				Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
				Files.write(path, data);
				return path.toString();
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
	}

	@Override
	public DefectDto getJson(String Defect) throws JsonMappingException, JsonProcessingException {
		DefectDto defectJson = new DefectDto();
		ObjectMapper objectMapper = new ObjectMapper();
		defectJson = objectMapper.readValue(Defect, DefectDto.class);
		return defectJson;
	}

	public void fileUploadCall(DefectDto defectDto, MultipartFile file) throws IOException {
		java.sql.Date date = new Date(System.currentTimeMillis());
		defectDto.setTimeStamp(date);
		defectDto.setDefectStatusId(1);
		defectDto.setFile(fileUpload(file));
	}

}
