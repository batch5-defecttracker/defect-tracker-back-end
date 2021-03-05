package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="projectEmp")
public class ProjectEmp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long proEmpId;
	private long proId;
	private long modId;
	private long empId;
	private long desId;
	private long subModId;
	
	

}
