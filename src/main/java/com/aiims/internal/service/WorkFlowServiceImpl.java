/**
 * 
 */
package com.aiims.internal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aiims.internal.repository.HospitalRepository;

/**
 * @author faza
 *
 */
public class WorkFlowServiceImpl implements WorkFlowService{

	@Autowired
	private HospitalRepository hospitalRepo;
	
	@Override
	public List<String> fetchListOfHospitals() {
		List<String> hospitalNames = hospitalRepo.fetchHospitalNames();
		//compare by name alphabeticaaly
		hospitalNames.sort(String::compareTo);
		return hospitalNames;
	}

}
