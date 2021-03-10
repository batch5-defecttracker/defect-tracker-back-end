package com.defect.tracker.data.dto;

import java.util.Date;

public class DefectDto {

	private long Id;
	private String defDescription;
	private String str;
	private long moduleId;
	private long submoduleId;
	private long employeeId;
	private long employee2Id;
	private long priorityId;
	private long sverityId;
	private long defectStatusId;
	private long defectTypeId;
	private Date timeStamp;
	private String file;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getDefDescription() {
		return defDescription;
	}
	public void setDefDescription(String defDescription) {
		this.defDescription = defDescription;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public long getModuleId() {
		return moduleId;
	}
	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}
	public long getSubmoduleId() {
		return submoduleId;
	}
	public void setSubmoduleId(long submoduleId) {
		this.submoduleId = submoduleId;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public long getEmployee2Id() {
		return employee2Id;
	}
	public void setEmployee2Id(long employee2Id) {
		this.employee2Id = employee2Id;
	}
	public long getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(long priorityId) {
		this.priorityId = priorityId;
	}
	public long getSverityId() {
		return sverityId;
	}
	public void setSverityId(long sverityId) {
		this.sverityId = sverityId;
	}
	public long getDefectStatusId() {
		return defectStatusId;
	}
	public void setDefectStatusId(long defectStatusId) {
		this.defectStatusId = defectStatusId;
	}
	public long getDefectTypeId() {
		return defectTypeId;
	}
	public void setDefectTypeId(long defectTypeId) {
		this.defectTypeId = defectTypeId;
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
	
	//Getters and Setters
	
	
	//Constructors
	

}
