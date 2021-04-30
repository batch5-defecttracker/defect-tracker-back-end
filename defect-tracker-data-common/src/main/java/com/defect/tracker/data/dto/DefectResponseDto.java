package com.defect.tracker.data.dto;

import java.util.Date;

public class DefectResponseDto {

	private long id;
	private String defectDescription;
	private String str;
	private ModuleDto module;
	private SubModuleDto submodule;
	private EmployeeDto assignedBy;
	private EmployeeDto assignedTo;
	private PriorityDto priority;
	private SeverityDto severity;
	private DefectStatusDto defectStatus;
	private DefectTypeDto defectType;
	private Date timeStamp;
	private String file;

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

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public ModuleDto getModule() {
		return module;
	}

	public void setModule(ModuleDto module) {
		this.module = module;
	}

	public SubModuleDto getSubmodule() {
		return submodule;
	}

	public void setSubmodule(SubModuleDto submodule) {
		this.submodule = submodule;
	}

	public EmployeeDto getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(EmployeeDto assignedBy) {
		this.assignedBy = assignedBy;
	}

	public EmployeeDto getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(EmployeeDto assignedTo) {
		this.assignedTo = assignedTo;
	}

	public PriorityDto getPriority() {
		return priority;
	}

	public void setPriority(PriorityDto priority) {
		this.priority = priority;
	}

	public SeverityDto getSeverity() {
		return severity;
	}

	public void setSeverity(SeverityDto severity) {
		this.severity = severity;
	}

	public DefectStatusDto getDefectStatus() {
		return defectStatus;
	}

	public void setDefectStatus(DefectStatusDto defectStatus) {
		this.defectStatus = defectStatus;
	}

	public DefectTypeDto getDefectType() {
		return defectType;
	}

	public void setDefectType(DefectTypeDto defectType) {
		this.defectType = defectType;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}
