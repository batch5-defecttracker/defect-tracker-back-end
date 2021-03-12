package com.defect.tracker.data.dto;

public class SubModuleResponseDto {
	private Long id;
	private String subModuleName;
	private ModuleDto module;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubModuleName() {
		return subModuleName;
	}
	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}
	public ModuleDto getModule() {
		return module;
	}
	public void setModule(ModuleDto module) {
		this.module = module;
	}
	

	

}
