package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "defecttype")
public class DefectType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long defTypeId;
	private String defTypeName;
	public long getDefTypeId() {
		return defTypeId;
	}
	public void setDefTypeId(long defTypeId) {
		this.defTypeId = defTypeId;
	}
	public String getDefTypeName() {
		return defTypeName;
	}
	public void setDefTypeName(String defTypeName) {
		this.defTypeName = defTypeName;
	}
	
	

}
