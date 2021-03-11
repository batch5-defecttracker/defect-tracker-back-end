package com.defect.tracker.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.defect.tracker.data.dto.EmployeeDto;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.EmployeeService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class EmployeeController {
	
	private static String UPLOADED_FOLDER="C://Users/Admin/OneDrive/Desktop/Cudeson/defect-tracker-back-end/defect-tracker-server/src/main/resources/";
	private static String UPLOADED_FOLDER_1="C://Users/Admin/OneDrive/Desktop/Cudeson/defect-tracker-back-end/defect-tracker-server/src/main/resources/admin.png/";
	@Autowired
	EmployeeService employeeService;

	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@Autowired
	private Mapper mapper;

	@PostMapping(value = EndpointURI.EMPLOYEE)
	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeDto employeeDto) {
		if (employeeService.isEmailAlreadyExist(employeeDto.getEmail())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMAIL_EXISTS,
					validationFailureStatusCodes.getEmailAlreadyExist()), HttpStatus.BAD_REQUEST);
		}
		Employee employee = mapper.map(employeeDto, Employee.class);
		employeeService.createEmployee(employee);
		return new ResponseEntity<Object>(Constants.EMPLOYEE_ADD_SUCCESS, HttpStatus.OK);
	}
	

	
	@GetMapping(value= EndpointURI.GetEmployeebyName )
	public ResponseEntity<Object> findEmployeeByName(@PathVariable String firstName){
		return new ResponseEntity<Object>(employeeService.findByFirstName(firstName), HttpStatus.OK);

	} 

	
	@GetMapping(value=EndpointURI.EMPLOYEE_GET)
	public ResponseEntity<Object> findEmployeeById(@PathVariable Long id){
		if (!employeeService.idExist(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS,
					validationFailureStatusCodes.getEmployeeNotExist()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(employeeService.findById(id), HttpStatus.OK);
	}

	
	@GetMapping(value = EndpointURI.EMPLOYEE)
	public ResponseEntity<Object> getAllEmp(){
		if (employeeService.getAll().isEmpty()) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_EMPTY,
					validationFailureStatusCodes.getEmployeeNotFound()), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Object>(employeeService.getAll(), HttpStatus.OK);
	}
	


	@DeleteMapping(value = EndpointURI.DELETE_EMPLOYEE)
	public ResponseEntity<Object> deleteEmployee(@PathVariable Long id) {
		if (!employeeService.isEmployeeAlreadyExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS,
					validationFailureStatusCodes.getEmployeeNotExist()),HttpStatus.BAD_REQUEST);
		}
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Object>(Constants.EMPLOYEE_DELETE_SUCCESS, HttpStatus.OK);
	}
	
	@GetMapping(value= EndpointURI.GET_EMPLOYEE_BY_DESIGNATION )
	public ResponseEntity<Object> findEmployeeByDesignation(@PathVariable Long designationId){
		if (!employeeService.isEmployeeExists(designationId)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_EMPTY,
					validationFailureStatusCodes.getEmployeeNotFound()), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Object>(mapper.map(employeeService.findByDes(designationId), EmployeeDto.class), HttpStatus.OK);

	}
	
	@PutMapping(value = EndpointURI.EMPLOYEE_PHOTO_UPDATE)
	public ResponseEntity<Object> updateEmployeePhoto(@PathVariable Long id , @RequestParam("file") MultipartFile file,RedirectAttributes redirectAttributes) throws IOException{
	
		if (!employeeService.isEmployeeAlreadyExists(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS,
					validationFailureStatusCodes.getEmployeeNotExist()),HttpStatus.BAD_REQUEST);
		}
		
		if (file.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	   }
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);
	            Path path1 = Paths.get(UPLOADED_FOLDER_1);
	            
	            Employee employee = employeeService.findById(id).get();
	            EmployeeDto employeedto = mapper.map(employee, EmployeeDto.class);
	            employeedto.setImage(path1.toString());
	            employee = mapper.map(employeedto, Employee.class);
	            employeeService.createEmployee(employee);

	           return new ResponseEntity<Object>(Constants.EMPLOYEE_PHOTO_UPDATE_SUCCESS, HttpStatus.OK);
	
	}
	

}