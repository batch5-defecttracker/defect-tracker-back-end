package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ProjectDto {

	private Long id;
	@NotNull(message = "{projectDto.projectName.null}")
	@NotBlank(message = "{projectDto.projectName.empty}")
	@Pattern(regexp="^[a-zA-Z ]*$",message="No Special Charcter Accepeted")
	private String projectName;
	@NotNull(message = "{projectDto.abbrevation.null}")
	@NotBlank(message = "{projectDto.abbrevation.empty}")
	@Pattern(regexp="^[a-zA-Z ]*$",message="No Special Charcter Accepeted")
	private String abbrevation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

}
