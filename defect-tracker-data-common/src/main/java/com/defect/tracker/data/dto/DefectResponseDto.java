package com.defect.tracker.data.dto;

import java.util.Date;

import com.defect.tracker.data.entities.DefectStatus;
import com.defect.tracker.data.entities.DefectType;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.entities.Priority;
import com.defect.tracker.data.entities.Severity;
import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.entities.Module;

public class DefectResponseDto {	
	
	private long id;
	private String defectDescription;
	private String str;
	private Module module;
	private SubModule submodule;
	private Employee employee;
	private Employee employee2;
	private Priority priority;
	private Severity severity;
	private DefectStatus defectStatus;
	private DefectType defectType;
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
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public SubModule getSubmodule() {
		return submodule;
	}
	public void setSubmodule(SubModule submodule) {
		this.submodule = submodule;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee2() {
		return employee2;
	}
	public void setEmployee2(Employee employee2) {
		this.employee2 = employee2;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public Severity getSeverity() {
		return severity;
	}
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	public DefectStatus getDefectStatus() {
		return defectStatus;
	}
	public void setDefectStatus(DefectStatus defectStatus) {
		this.defectStatus = defectStatus;
	}
	public DefectType getDefectType() {
		return defectType;
	}
	public void setDefectType(DefectType defectType) {
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
