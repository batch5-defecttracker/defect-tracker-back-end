package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "defectStatus")
public class DefectStatus {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long defStId;
	private String defStIdName;
	
	public long getDefStId() {
		return defStId;
	}
	public void setDefStId(long defStId) {
		this.defStId = defStId;
	}
	public String getDefStIdName() {
		return defStIdName;
	}
	public void setDefStIdName(String defStIdName) {
		this.defStIdName = defStIdName;
	}
	
	

}
