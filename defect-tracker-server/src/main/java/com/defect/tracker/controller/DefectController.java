package com.defect.tracker.controller;

import java.io.IOException;
import java.sql.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.dto.DefectResponseDto;
import com.defect.tracker.data.dto.DefectSearchDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.DefectRepository;
import com.defect.tracker.data.repositories.DefectStatusRepository;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DefectService;
import com.defect.tracker.services.DefectServiceImpl;
import com.defect.tracker.services.DefectStatusService;
import com.defect.tracker.services.EmployeeService;
import com.defect.tracker.services.MailServiceImpl;
import com.defect.tracker.services.ModuleService;
import com.defect.tracker.services.ProjectEmployeeAllocationService;
import com.defect.tracker.services.ProjectService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;
import com.sipios.springsearch.anotation.SearchSpec;

@RestController
public class DefectController {

	@Autowired
	ProjectService projectService;
	@Autowired
	DefectService defectService;
	@Autowired
	ModuleService moduleService;
	@Autowired
	MailServiceImpl mailServiceImpl;
	@Autowired
	DefectServiceImpl defectServiceImpl;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	ProjectEmployeeAllocationService projectEmployeeAllocationService;
	@Autowired
	DefectStatusService defectStatusService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;
	@Autowired
	DefectStatusRepository defectStatusRepository;
	@Autowired
	DefectRepository defectRepository;

	@GetMapping(value = EndpointURI.DEFECT)
	public ResponseEntity<Object> getAllDefect() {

		return new ResponseEntity<Object>(mapper.map(defectService.getAllDefect(), DefectResponseDto.class),
				HttpStatus.OK);
	}

	@PostMapping(value = EndpointURI.DEFECT)
	public ResponseEntity<Object> addDefect(@Valid @RequestPart String defect1, @RequestPart("file") MultipartFile file)
			throws IOException {
		DefectDto defectDto = defectService.getJson(defect1);
		if (!(projectEmployeeAllocationService.existsByEmployeeIdAndProjectId(defectDto.getAssignedToId(),moduleService.findById(defectDto.getModuleId()).getProject().getId()))) {
			return new ResponseEntity<Object>(
					new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS,
							validationFailureStatusCodes.getEmployeeNotExist()),
					HttpStatus.BAD_REQUEST);
		}
		if (!(projectEmployeeAllocationService.existsByEmployeeIdAndProjectId(defectDto.getModuleId(),moduleService.findById(defectDto.getModuleId()).getProject().getId()))) {
				return new ResponseEntity<Object>(new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS,
					validationFailureStatusCodes.getModuleNotExist()), HttpStatus.BAD_REQUEST);
		}
	
		if (!(projectEmployeeAllocationService.existsByEmployeeIdAndProjectId(defectDto.getSubmoduleId(),moduleService.findById(defectDto.getModuleId()).getProject().getId()))) {
				return new ResponseEntity<Object>(new ValidationFailureResponse(ValidationConstance.SUB_MODULE_NOT_EXISTS,
					validationFailureStatusCodes.getSubModuleNotExist()), HttpStatus.BAD_REQUEST);
		}
		defectServiceImpl.fileUploadCall(defectDto, file);
		defectService.addDefect(mapper.map(defectDto, Defect.class));
		defectServiceImpl.dataPassForAddDefect(defectDto);
		return new ResponseEntity<Object>(Constants.DEFECT_ADD_SUCCESS, HttpStatus.OK);
	}

	@PutMapping(value = EndpointURI.DEFECT, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.MULTIPART_FORM_DATA_VALUE })
	public ResponseEntity<Object> updateDefect(@Valid @RequestPart String defect1, @RequestPart MultipartFile file)
			throws IOException {
		java.sql.Date date = new Date(System.currentTimeMillis());
		DefectDto defectDto = defectService.getJson(defect1);
		defectDto.setTimeStamp(date);
		defectServiceImpl.defectUpdateQA(defectDto);
		defectServiceImpl.defectUpdateDV(defectDto);
		if (!defectService.isDefectExists(defectDto.getId())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_NOT_EXISTS,
					validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}
		if (defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get().getDefectStatusName()
				.equalsIgnoreCase(Constants.OPEN)
				|| defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get().getDefectStatusName()
						.equalsIgnoreCase(Constants.FIXED)
				|| defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get().getDefectStatusName()
						.equalsIgnoreCase(Constants.REJECT)) {
			if (defectService.findById(defectDto.getId()).get().getDefectStatus().getId() == defectDto
					.getDefectStatusId()) {
				defectDto.setFile(defectServiceImpl.fileUpload(file));
				Defect defect = mapper.map(defectDto, Defect.class);
				defectService.addDefect(defect);
				return new ResponseEntity<Object>(Constants.UPDATE_DEFECT, HttpStatus.OK);
			}
			defectDto.setFile(defectServiceImpl.fileUpload(file));
			Defect defect = mapper.map(defectDto, Defect.class);
			defectService.addDefect(defect);
			defectServiceImpl.dataPassForMail(defectDto);
			return new ResponseEntity<Object>(Constants.UPDATE_DEFECT, HttpStatus.OK);
		}
		if (defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get().getDefectStatusName()
				.equalsIgnoreCase(Constants.CLOSED)
				|| defectStatusService.getDefectStatusById(defectDto.getDefectStatusId()).get().getDefectStatusName()
						.equalsIgnoreCase(Constants.RE_OPEN)) {
			if (defectService.findById(defectDto.getId()).get().getDefectStatus().getId() == defectDto
					.getDefectStatusId()) {
				defectDto.setFile(defectServiceImpl.fileUpload(file));
				Defect defect = mapper.map(defectDto, Defect.class);
				defectService.addDefect(defect);
				return new ResponseEntity<Object>(Constants.UPDATE_DEFECT, HttpStatus.OK);
			}
			defectDto.setFile(defectServiceImpl.fileUpload(file));
			Defect defect = mapper.map(defectDto, Defect.class);
			defectService.addDefect(defect);
			defectServiceImpl.dataPassForListMail(defectDto);
			return new ResponseEntity<Object>(Constants.UPDATE_DEFECT, HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_STATUS_NOT_EXISTS,
				validationFailureStatusCodes.getDefectStatusNotExist()), HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = EndpointURI.DEFECT_GET_BY_ID)
	public ResponseEntity<Object> getDefectById(@PathVariable Long id) {
		if (!defectService.isDefectExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_ID_NOT_EXISTS,
					validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}
		DefectResponseDto defectDto = mapper.map(defectService.findById(id), DefectResponseDto.class);
		return new ResponseEntity<Object>(defectDto, HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.GET_DEFECT_BY_ASSIGN_TO_ID)
	public ResponseEntity<Object> getDefByAssignId(@PathVariable Long id) {
		if (!employeeService.isEmployeeExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS,
					validationFailureStatusCodes.getEmployeeNotExist()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(defectService.getByEmpIdAndStatus(id), HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.GET_ALL_DEFECT_BY_PROJECT_ID)
	public ResponseEntity<Object> getAllDefectByProId(@PathVariable Long id) {
		if (!projectService.existProject(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_DOES_NOT_EXISTS,
					validationFailureStatusCodes.getProjectNotExist()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(defectService.getAllDefectByProId(id), HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.GET_DEFECT_BY_SERACH)
	public ResponseEntity<Object> search(@SearchSpec Specification<Defect> specs) {
		return new ResponseEntity<Object>(
				mapper.map(defectRepository.findAll(Specification.where(specs)), DefectSearchDto.class), HttpStatus.OK);
	}
}