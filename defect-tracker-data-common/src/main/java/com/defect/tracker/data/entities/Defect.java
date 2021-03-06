package com.defect.tracker.data.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.jsf.FacesContextUtils;

@Entity
@Table(name="defect")
public class Defect { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String defDescription;
	private String str;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modId", nullable = false)
	private Module module;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subModId", nullable = false)
	private SubModule submodule;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assignedBy", nullable = false)
	private Employee employee;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assignedTo", nullable = false)
	private Employee employee2;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prioId", nullable = false)
	private Priority priority;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sevId", nullable = false)
	private Severity sverity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "defStId", nullable = false)
	private DefectStatus defectStatus;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "defTypeId", nullable = false)
	private DefectType defectType;
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
	public Severity getSverity() {
		return sverity;
	}
	public void setSverity(Severity sverity) {
		this.sverity = sverity;
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
