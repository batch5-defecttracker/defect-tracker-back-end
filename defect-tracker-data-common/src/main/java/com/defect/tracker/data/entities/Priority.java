package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prority")
public class Priority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String prioName;

	
	private Long Id;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getPrioName() {
		return prioName;
	}
	public void setPrioName(String prioName) {
		this.prioName = prioName;
	}

}
