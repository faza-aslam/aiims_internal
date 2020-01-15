/**
 * 
 */
package com.aiims.internal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiims.internal.service.IWorkFlowService;

/**
 * @author faza
 *
 */
@RestController
@RequestMapping("/aiims-internal")
public class WorkFlowController {

	@Autowired
	private IWorkFlowService workFlowService;
	
	@GetMapping("/")
	public String getHi() {
		return "hello";
	}
}
