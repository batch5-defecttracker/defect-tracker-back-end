package com.defect.tracker.data.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeDto {

	private Long id;
	@NotNull(message = "{employeeDto.FirstName.null}")
	@NotBlank(message = "{employeeDto.FirstName.blank}")
	@NotEmpty(message = "{employeeDto.FirstName.empty}")
	@Pattern(regexp = "^[a-zA-Z ]*$", message = "No Special Charcter Accepeted")
	private String firstName;
	@NotNull(message = "{employeeDto.lastName.null}")
	@NotBlank(message = "{employeeDto.lastName.blank}")
	@NotEmpty(message = "{employeeDto.lastName.empty}")
	@Pattern(regexp = "^[a-zA-Z ]*$", message = "No Special Charcter Accepeted")
	private String lastName;
	private Long designationId;
	@Pattern(regexp = " Pattern.compile(\"@[.]\"", message = "Please Put Valid Characters For Email Ex- abc@yahoo.com")
	@NotNull(message = "{employeeDto.email.null}")
	@NotEmpty(message = "{employeeDto.email.empty}")
	@NotBlank(message = "{employeeDto.email.blank}")
	private String email;
	@NotNull(message = "{employeeDto.address.null}")
	@NotBlank(message = "{employeeDto.address.blank}")
	@NotEmpty(message = "{employeeDto.address.empty}")
	private String address;
	@NotNull(message = "{employeeDto.contactNumber.null}")
	@NotBlank(message = "{employeeDto.contactNumber.blank}")
	@NotEmpty(message = "{employeeDto.contactNumber.empty}")
	private String contactNumber;
	@NotNull(message = "{employeeDto.nic.null}")
	@NotBlank(message = "{employeeDto.nic.blank}")
	@NotEmpty(message = "{employeeDto.nic.empty}")
	@Pattern(regexp = "^([0-9]{9}[x|X|v|V]|[0-9]{12})$", message = "Invalid NIC")
	private String nic;
	private String image;
	private Date timeStamp;
	@NotNull(message = "{employeeDto.gender.null}")
	@NotBlank(message = "{employeeDto.gender.blank}")
	@NotEmpty(message = "{employeeDto.gender.empty}")
	private String gender;
	private boolean verification;
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getDesignationId() {
		return designationId;
	}

	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
