package com.defect.tracker.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.defect.tracker.data.entities.Login;
import com.defect.tracker.services.LoginService;
import com.defect.tracker.util.EndpointURI;


@RestController
public class LoginController {
	private List<Login>vah;
	
	
	@Autowired LoginService loginService ;
	
	@GetMapping(value = EndpointURI.LOGINSTATUS)
	public List<Login> getEmployee(){
		//vah = loginService.getEmployee();
		return vah;
		
	}
}
