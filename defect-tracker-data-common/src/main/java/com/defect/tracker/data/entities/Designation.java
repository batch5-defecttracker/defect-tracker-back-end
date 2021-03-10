package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "designation")
public class Designation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String DesName;
	
	public String getDesName() {
		return DesName;
	}
	public void setDesName(String desName) {
		DesName = desName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
