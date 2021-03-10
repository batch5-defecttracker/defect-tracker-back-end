package com.defect.tracker.data.dto;

public class DefectStatusDto {
	
	private long id;
	private String defStIdName;
	
	public String getDefStIdName() {
		return defStIdName;
	}
	public void setDefStIdName(String defStIdName) {
		this.defStIdName = defStIdName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
