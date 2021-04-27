package com.defect.tracker.data.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeUpdateDto {

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
	private Date timeStamp;

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

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}