package com.defect.tracker.data.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="submodule")
public class SubModule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long subModId;
	private String subModuleName;
	private Long  modId;
	
	
	
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
