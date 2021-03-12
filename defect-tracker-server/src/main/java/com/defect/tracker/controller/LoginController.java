package com.defect.tracker.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.defect.tracker.data.dto.LoginDto;
import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.services.LoginService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@Controller
public class LoginController {
	private List<Login>vah;

	
	@Autowired
	LoginService loginService;
	
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	
	@Autowired
	private Mapper mapper;
	
	
	@PutMapping(value = EndpointURI.UPDATE_EMPLOYEE_STATUS)
	public ResponseEntity<Object> updateEmployeeStatus(@RequestBody LoginDto loginDto) {
		Login login = mapper.map(loginDto, Login.class);
		loginService.updateEmployeeStatus(login);
			return new ResponseEntity<Object>(Constants.EMPLOYEE_STATUS_UPDATED,HttpStatus.OK);	
	}

}
