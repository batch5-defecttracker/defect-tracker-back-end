package com.defect.tracker.data.dto;

public class DefectTypeDto {
	
	private long id;
	private String defTypeName;

	public String getDefTypeName() {
		return defTypeName;
	}
	public void setDefTypeName(String defTypeName) {
		this.defTypeName = defTypeName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
