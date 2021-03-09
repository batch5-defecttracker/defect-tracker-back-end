package com.defect.tracker.data.dto;

public class SubModuleDto {
	
	private Long id;
	private String subModuleName;
	private Long modId;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
