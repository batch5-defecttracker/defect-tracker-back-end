package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginDto {
	@NotNull(message = "{loginDto.loginEmail.Null}")
	@NotBlank(message = "{loginDto.loginEmail.Blank}")
	@NotEmpty(message = "{loginDto.loginEmail.empty}")
	private String email;
	@NotBlank(message = "{loginDto.loginUserName.Blank}")
	@NotNull(message = "{loginDto.loginUserName.Null}")
	@NotEmpty(message = "{loginDto.loginUserName.empty}")
	private String userName;
	@NotBlank(message = "{loginDto.loginPassword.Blank}")
	@NotNull(message = "{loginDto.loginPassword.Null}")
	@NotEmpty(message = "{loginDto.loginPassword.empty}")
	private String password;
	private boolean status;
	private Long employeeId;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

}
