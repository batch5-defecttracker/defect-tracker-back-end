package com.defect.tracker.data.dto;

public class DefectSearchDto {

	private long id;
	private String defectDescription;
	private String moduleName;
	private String submoduleName;
	private String priorityName;
	private String severityName;
	private String defectStatusName;
	private String defectTypeName;

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getSubmoduleName() {
		return submoduleName;
	}

	public void setSubmoduleName(String submoduleName) {
		this.submoduleName = submoduleName;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public String getSeverityName() {
		return severityName;
	}

	public void setSeverityName(String severityName) {
		this.severityName = severityName;
	}

	public String getDefectStatusName() {
		return defectStatusName;
	}

	public void setDefectStatusName(String defectStatusName) {
		this.defectStatusName = defectStatusName;
	}

	public String getDefectTypeName() {
		return defectTypeName;
	}

	public void setDefectTypeName(String defectTypeName) {
		this.defectTypeName = defectTypeName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDefectDescription() {
		return defectDescription;
	}

	public void setDefectDescription(String defectDescription) {
		this.defectDescription = defectDescription;
	}

}
