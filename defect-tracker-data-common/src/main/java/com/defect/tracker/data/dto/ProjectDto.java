package com.defect.tracker.data.dto;

public class ProjectDto {

	private Long proID;
	private String proName;
	private String abbrevation;
	
	public Long getProID() {
		return proID;
	}
	public void setProID(Long proID) {
		this.proID = proID;
	}
	
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	public String getAbbrevation() {
		return abbrevation;
	}
	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}
	
	
	
}
