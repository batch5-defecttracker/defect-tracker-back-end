package com.defect.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.entities.DefectStatus;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DefectStatusService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class DefectStatusController {
	@Autowired
	private DefectStatusService defectStatusService;
	@Autowired
	Mapper mapper;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@GetMapping(value = EndpointURI.DEFECTSTATUS)
	public ResponseEntity<Object> getAllDefectStatus() {
		if (defectStatusService.getAllDefectStatus().isEmpty()) {
			return new ResponseEntity<Object>(new ValidationFailureResponse(ValidationConstance.DEFECT_STATUS_EMPTY,
					validationFailureStatusCodes.getDefectNotExist()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(mapper.map(defectStatusService.getAllDefectStatus(), DefectStatus.class),
				HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.DEFECT_STATUS)
	public ResponseEntity<Object> getDefectStatusById(@PathVariable Long id) {
		if (!defectStatusService.getDefectStatusById(id).isEmpty()) {
			if (defectStatusService.getDefectStatusById(id).get().getDefectStatusName()
					.equalsIgnoreCase(Constants.OPEN)) {
				return new ResponseEntity<Object>(
						defectStatusService.addDropDownStatus(Constants.FIXED, Constants.REJECT), HttpStatus.OK);
			} else if (defectStatusService.getDefectStatusById(id).get().getDefectStatusName()
					.equalsIgnoreCase(Constants.NEW)) {
				return new ResponseEntity<Object>(
						defectStatusService.addDropDownStatus(Constants.OPEN, Constants.REJECT), HttpStatus.OK);
			} else if (defectStatusService.getDefectStatusById(id).get().getDefectStatusName()
					.equalsIgnoreCase(Constants.RE_OPEN)) {
				return new ResponseEntity<Object>(
						defectStatusService.addDropDownStatus(Constants.OPEN, Constants.REJECT), HttpStatus.OK);
			} else if (defectStatusService.getDefectStatusById(id).get().getDefectStatusName()
					.equalsIgnoreCase(Constants.FIXED)) {
				return new ResponseEntity<Object>(
						defectStatusService.addDropDownStatus(Constants.CLOSED, Constants.RE_OPEN), HttpStatus.OK);
			} else if (defectStatusService.getDefectStatusById(id).get().getDefectStatusName()
					.equalsIgnoreCase("Closed")) {
				DefectStatus defectStatus = defectStatusService.getDefectStatusByName("Reopen");
				return new ResponseEntity<Object>(defectStatus, HttpStatus.OK);
			} else if (defectStatusService.getDefectStatusById(id).get().getDefectStatusName()
					.equalsIgnoreCase("Reject")) {
				DefectStatus defectStatus = defectStatusService.getDefectStatusByName("Reopen");
				return new ResponseEntity<Object>(defectStatus, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_STATUS_NOT_EXISTS,
				validationFailureStatusCodes.getDefectStatusNotExist()), HttpStatus.BAD_REQUEST);
	}

}
