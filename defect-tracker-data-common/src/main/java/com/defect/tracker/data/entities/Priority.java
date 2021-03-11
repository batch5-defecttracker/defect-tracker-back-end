package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "priority")
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
	private Long id;
	private String priorityName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPriorityName() {
		return priorityName;

	}
	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
