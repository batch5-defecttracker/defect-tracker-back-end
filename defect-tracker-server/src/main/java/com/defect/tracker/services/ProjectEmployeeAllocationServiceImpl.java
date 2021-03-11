package com.defect.tracker.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.defect.tracker.data.entities.ProjectEmp;
import com.defect.tracker.data.repositories.ProjectEmployeeAllocationRepository;

@Service
public class ProjectEmployeeAllocationServiceImpl implements ProjectEmployeeAllocationService{
	
	@Autowired
	 ProjectEmployeeAllocationRepository projectemployeeallocationRepository; 

	@Override
	public void deAllocateProject(Long id) {
		projectemployeeallocationRepository.deleteById(id);
		
	}

	
	  @Override public boolean existsByid(Long id) { return
	  projectemployeeallocationRepository.existsById(id); }
	 

	@Override
	public void addProjectAllocation(ProjectEmp projectEmp) {
		projectemployeeallocationRepository.save(projectEmp);
		
	}

	
	  @Override public List<ProjectEmp> getAll() { return
	  projectemployeeallocationRepository.findAll(); 
	  }
	  
		/*
		 * @Override public List<ProjectEmp> getAllModuleAllocations() { return
		 * projectemployeeallocationRepository.findAll(); }
		 */


		/*
		 * @Override public boolean isModuleNotExist(String name) { ((Object)
		 * projectemployeeallocationRepository).existsByName(name); return false; }
		 */
	  
	  @Override
		public void update(ProjectEmp projectEmp) {
			projectemployeeallocationRepository.save(projectEmp);
			
		}

		
}
