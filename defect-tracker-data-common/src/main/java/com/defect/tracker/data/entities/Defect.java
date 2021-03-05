package com.defect.tracker.data.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="defect")
public class Defect {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long defId;
	private String defDescription;
	private String str;
	private long modId;
	private long subModId;
	private long assignedBy;
	private long assignedTo;
	private long prioId;
	private long sevId;
	private long defStId;
	private long defTypeId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="timeStamp", nullable= false)
	private Date timeStamp;
	private String file;

}
