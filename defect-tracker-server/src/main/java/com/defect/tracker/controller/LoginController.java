package com.defect.tracker.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.LoginResDto;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.services.LoginService;
import com.defect.tracker.util.EndpointURI;


@RestController
public class LoginController {
	
	@Autowired Mapper mapper;

	@Autowired LoginService loginService ;

		@GetMapping(value=EndpointURI.LOGINSTATUS)
		public List<LoginResDto>  GetEmpId(@PathVariable String status){
			return mapper.map(loginService.findByEmployeeId(status), LoginResDto.class);
			}
}
