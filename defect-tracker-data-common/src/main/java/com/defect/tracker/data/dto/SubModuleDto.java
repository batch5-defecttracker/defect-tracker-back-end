package com.defect.tracker.data.dto;

public class SubModuleDto {
	
	private Long subModId;
	private String subModuleName;
	private Long modId;
	
	
	public Long getSubModId() {
		return subModId;
	}
	public void setSubModId(Long subModId) {
		this.subModId = subModId;
	}
	
	public String getSubModuleName() {
		return subModuleName;
	}
	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}
	
	public Long getModId() {
		return modId;
	}
	public void setModId(Long modId) {
		this.modId = modId;
	}

}
