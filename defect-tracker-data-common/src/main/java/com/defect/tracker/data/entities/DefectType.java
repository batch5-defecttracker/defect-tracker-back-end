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
	private long id;
	private String defTypeName;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDefTypeName() {
		return defTypeName;
	}
	public void setDefTypeName(String defTypeName) {
		this.defTypeName = defTypeName;
	}
	
	

}
