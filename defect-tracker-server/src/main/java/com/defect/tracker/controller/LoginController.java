package com.defect.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.LoginResDto;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.repositories.LoginRepository;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.LoginService;
import com.defect.tracker.services.MailServiceImpl;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	MailServiceImpl mailServiceImpl;

	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@Autowired
	private Mapper mapper;
	

	@PutMapping(value = EndpointURI.UPDATE_EMPLOYEE_STATUS)
	public ResponseEntity<Object> updateEmployeeStatus(@PathVariable String email,@PathVariable String status) {
		
		if (!loginService.isEmailAlreadyExist(email)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMAIL_NOT_EXISTS,
					validationFailureStatusCodes.getEmailNotExist()), HttpStatus.BAD_REQUEST);
		}
		String employee = loginRepository.findByEmail(email).get().getUserName();
		mailServiceImpl.sendApprovalEmail(email, employee, status);
		loginService.updateEmployeeStatus(email, status);
		return new ResponseEntity<Object>(Constants.EMPLOYEE_STATUS_UPDATED, HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.LOGINSTATUS)
	public List<LoginResDto> GetEmpId(@RequestParam String status) {
		return mapper.map(loginService.getLoginByStatus(status), LoginResDto.class);
	}

}
