package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prority")
public class Priority {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long prioId;
	private String prioName;
	
	
	public Long getPrioId() {
		return prioId;
	}
	public void setPrioId(Long prioId) {
		this.prioId = prioId;
	}
	public String getPrioName() {
		return prioName;
	}
	public void setPrioName(String prioName) {
		this.prioName = prioName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
