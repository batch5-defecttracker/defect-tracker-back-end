package com.defect.tracker.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping("/forgot-password")
	public String forgotPassword(@RequestParam String email) {

		String response = loginService.forgotPassword(email);

		if (!response.startsWith("Invalid")) {
			response = "http://localhost:1724/reset-password?token=" + response;
		}
		return response;
	}

	@PutMapping("/reset-password")
	public String resetPassword(@RequestParam String token,
			@RequestParam String password) {

		return loginService.resetPassword(token, password);
	}
}
