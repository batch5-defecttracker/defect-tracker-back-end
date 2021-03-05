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
    private long desId;
	private String DesName;
	public long getDesId() {
		return desId;
	}
	public void setDesId(long desId) {
		this.desId = desId;
	}
	public String getDesName() {
		return DesName;
	}
	public void setDesName(String desName) {
		DesName = desName;
	}
	
}
