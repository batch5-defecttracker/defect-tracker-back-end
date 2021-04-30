package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class LoginEnterDto {
	@NotNull(message = "{loginDto.loginEmail.Null}")
	@NotBlank(message = "{loginDto.loginEmail.Blank}")
	@NotEmpty(message = "{loginDto.loginEmail.empty}")
	@Pattern(regexp = "[a-zA-Z.@]*", message = "No Special Charcter Accepeted")
	private String email;
	@NotBlank(message = "{loginDto.loginPassword.Blank}")
	@NotNull(message = "{loginDto.loginPassword.Null}")
	@NotEmpty(message = "{loginDto.loginPassword.empty}")
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
