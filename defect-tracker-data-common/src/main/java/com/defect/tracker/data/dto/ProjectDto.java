package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ProjectDto {

	private Long id;
	@NotNull(message = "{projectDto.projectName.null}")
	@NotBlank(message = "{projectDto.projectName.blank}")
	@NotEmpty(message = "{projectDto.projectName.empty}")
	@Pattern(regexp = "^[a-zA-Z ]*$", message = "No Special Charcter Accepeted")
	private String name;
	@NotNull(message = "{projectDto.abbrevation.null}")
	@NotBlank(message = "{projectDto.abbrevation.blank}")
	@NotEmpty(message = "{projectDto.abbrevation.empty}")
	@Pattern(regexp = "^[a-zA-Z ]*$", message = "No Special Charcter Accepeted")
	private String abbrevation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

}
