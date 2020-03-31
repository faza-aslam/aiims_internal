/**
 * 
 */
package com.aiims.internal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aiims.internal.entity.PersonDetails;
import com.aiims.internal.model.request.RequestDto;
import com.aiims.internal.repository.PersonDetailsRepository;

/**
 * @author faza
 *
 */
public class WorkFlowServiceImpl implements WorkFlowService{

	@Autowired
	private PersonDetailsRepository repo;

	@Override
	public String createContact(RequestDto request) {
		List<PersonDetails> lists = repo.fetchPersonDetails();
		
		for(PersonDetails l : lists) {
			if((l.getFirstName().equalsIgnoreCase(request.getFirstName()) &&
					l.getLastName().equalsIgnoreCase(request.getLastName())) ||
					l.getContactNumber().equals(request.getPhoneNumber()) ) {
				return "Contact already exists";
			}
		}
		
		saveDetails(request);
		return "Contact successfully created";
	}

	private void saveDetails(RequestDto request) {
		PersonDetails details = new PersonDetails();
		details.setFirstName(request.getFirstName());
		details.setLastName(request.getLastName());
		details.setContactNumber(request.getPhoneNumber());
		details.setAddress(request.getAddress());
		repo.save(details);
	}



}
