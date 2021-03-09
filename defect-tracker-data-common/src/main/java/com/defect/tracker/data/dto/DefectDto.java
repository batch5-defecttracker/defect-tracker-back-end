package com.defect.tracker.data.dto;

import java.util.Date;

public class DefectDto {

	private long defId;
	private String defDescription;
	private String str;
	private long modId;
	private long subModId;
	private long assignedBy;
	private long assignedTo;
	private long prioId;
	private long sevId;
	private long defStId;
	private long defTypeId;
	private Date timeStamp;
	private String file;
	
	//Getters and Setters
	public long getDefId() {
		return defId;
	}
	public void setDefId(long defId) {
		this.defId = defId;
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
	public long getModId() {
		return modId;
	}
	public void setModId(long modId) {
		this.modId = modId;
	}
	public long getSubModId() {
		return subModId;
	}
	public void setSubModId(long subModId) {
		this.subModId = subModId;
	}
	public long getAssignedBy() {
		return assignedBy;
	}
	public void setAssignedBy(long assignedBy) {
		this.assignedBy = assignedBy;
	}
	public long getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(long assignedTo) {
		this.assignedTo = assignedTo;
	}
	public long getPrioId() {
		return prioId;
	}
	public void setPrioId(long prioId) {
		this.prioId = prioId;
	}
	public long getSevId() {
		return sevId;
	}
	public void setSevId(long sevId) {
		this.sevId = sevId;
	}
	public long getDefStId() {
		return defStId;
	}
	public void setDefStId(long defStId) {
		this.defStId = defStId;
	}
	public long getDefTypeId() {
		return defTypeId;
	}
	public void setDefTypeId(long defTypeId) {
		this.defTypeId = defTypeId;
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
	
	//Constructors
	

}
