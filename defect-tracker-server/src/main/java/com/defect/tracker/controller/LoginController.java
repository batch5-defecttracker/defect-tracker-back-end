package com.defect.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@Autowired
	private Mapper mapper;

	@PutMapping(value = EndpointURI.UPDATE_EMPLOYEE_STATUS)
	public ResponseEntity<Object> updateEmployeeStatus(@PathVariable String email, @PathVariable String status) {

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
	public ResponseEntity<Object> GetEmpId(@RequestParam String status) {
		return new ResponseEntity<Object>(mapper.map(loginService.getLoginByStatus(status), LoginResDto.class),HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.LOGIN)
	public ResponseEntity<Object> login(@RequestParam String userName1, String password2, String email) {

		String userName = loginService.getUserName(email);
		String password = loginService.getUserPassword(email);

		if (userName1.equals(userName) && passwordEncoder.matches(password2, password)) {
			return new ResponseEntity<Object>(Constants.LOGIN_SUCCESS, HttpStatus.OK);

		}

		else if (!userName1.equals(userName) && passwordEncoder.matches(password2, password)) {
			return new ResponseEntity<Object>(Constants.WRONG_USER_NAME, HttpStatus.BAD_REQUEST);
		}

		else if (userName1.equals(userName) && !passwordEncoder.matches(password2, password)) {
			return new ResponseEntity<Object>(Constants.WRONG_PASSWORD, HttpStatus.BAD_REQUEST);
		}

		else if (userName1.isBlank() || (password2.isBlank())) {
			return new ResponseEntity<Object>(Constants.USER_NAME_OR_PASSWORD_EMPTY, HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<Object>(Constants.LOGIN_FAILED, HttpStatus.BAD_REQUEST);

	}

	@PostMapping(value = EndpointURI.FORGOT_PASSWORD)
	public ResponseEntity<Object> forgotPassword(@PathVariable String email) {
		String response = loginService.forgotPassword(email);

		if (!response.startsWith("Invalid")) {
			response = "Password reset Token is Sent to your Email Address Successfully \n" + response;
		}
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

	@PutMapping(value = EndpointURI.RESET_PASSWORD)
	public ResponseEntity<Object> resetPassword(@PathVariable String token, @PathVariable String password) {
		return new ResponseEntity<Object>( loginService.resetPassword(token, password),HttpStatus.OK);
	}
}
