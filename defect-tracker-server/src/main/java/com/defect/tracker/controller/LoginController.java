package com.defect.tracker.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.LoginDto;
import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.services.LoginService;
import com.defect.tracker.util.EndpointURI;


@RestController
public class LoginController {
	
	@Autowired Mapper mapper;

	@Autowired LoginService loginService ;

//		@GetMapping(value=EndpointURI.LOGINSTATUS)
//		public List<LoginDto>  GetEmpId(@RequestParam String status){
//			return mapper.map(loginService.findByEmployeeId(status), LoginDto.class);
//			}
}
