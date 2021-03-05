package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "severity")
public class Severity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sevId;
	private String sevName;
	public long getSevId() {
		return sevId;
	}
	public void setSevId(long sevId) {
		this.sevId = sevId;
	}
	public String getSevName() {
		return sevName;
	}
	public void setSevName(String sevName) {
		this.sevName = sevName;
	}
	
}
