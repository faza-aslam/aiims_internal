/**
 * 
 */
package com.aiims.internal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiims.internal.model.request.RequestDto;
import com.aiims.internal.service.WorkFlowService;

/**
 * @author faza
 *
 */
@RestController
@RequestMapping("/food")
public class WorkFlowController {

	@Autowired
	private WorkFlowService workFlowService;

	@PostMapping("/tracker")
	public ResponseEntity<String> createContact(@RequestBody RequestDto request){
		String response = workFlowService.createContact(request);
		return ResponseEntity.ok(response);
	}
	
}
