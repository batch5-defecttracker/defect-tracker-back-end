package com.defect.tracker.data.dto;

public class DefectAssignDto {
	
	private DefectStatusDto defectStatus;
	private PriorityDto priority;
	private SeverityDto severity;
	public DefectStatusDto getDefectStatus() {
		return defectStatus;
	}
	public void setDefectStatus(DefectStatusDto defectStatus) {
		this.defectStatus = defectStatus;
	}
	public PriorityDto getPriority() {
		return priority;
	}
	public void setPriority(PriorityDto priority) {
		this.priority = priority;
	}
	public SeverityDto getSeverity() {
		return severity;
	}
	public void setSeverity(SeverityDto severity) {
		this.severity = severity;
	}
	

}
