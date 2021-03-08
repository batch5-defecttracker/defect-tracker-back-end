package com.defect.tracker.data.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String proName;
	private String abbrevation;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
