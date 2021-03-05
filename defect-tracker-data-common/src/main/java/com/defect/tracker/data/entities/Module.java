package com.defect.tracker.data.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="module")
public class Module {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Long modId;
	private String moduleName;
	private Long proID;
	
	
	
	public Long getModId() {
		return modId;
	}
	public void setModId(Long modId) {
		this.modId = modId;
	}
	
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	
	public Long getProID() {
		return proID;
	}
	public void setProID(Long proID) {
		this.proID = proID;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
		
}
