/**
 * 
 */
package com.aiims.internal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiims.internal.service.WorkFlowService;

/**
 * @author faza
 *
 */
@RestController
@RequestMapping("/aiims-internal")
public class WorkFlowController {

	@Autowired
	private WorkFlowService workFlowService;
	
	@GetMapping("/hospitals")
	public ResponseEntity<List<String>> getListOfHospitals() {
		List<String> hospitals = workFlowService.fetchListOfHospitals();
		return new ResponseEntity<>(hospitals, HttpStatus.OK);
	}
}
