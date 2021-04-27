package com.defect.tracker.data.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeUpdateDto {

	private Long id;
	@NotNull(message = "{employeeDto.FirstName.empty}")
	@NotBlank(message = "{employeeDto.FirstName.blank}")
	@Pattern(regexp = "^[a-zA-Z ]*$", message = "No Special Charcter Accepeted")
	private String firstName;
	@NotNull(message = "{employeeDto.lastName.empty}")
	@NotBlank(message = "{employeeDto.lastName.blank}")
	@Pattern(regexp = "^[a-zA-Z ]*$", message = "No Special Charcter Accepeted")
	private String lastName;
	@NotNull(message = "{employeeDto.address.empty}")
	@NotBlank(message = "{employeeDto.address.blank}")
	private String address;
	@NotNull(message = "{employeeDto.contactNumber.empty}")
	@NotBlank(message = "{employeeDto.contactNumber.blank}")
	private String contactNumber;
	@NotNull(message = "{employeeDto.nic.empty}")
	@NotBlank(message = "{employeeDto.nic.blank}")
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