package com.aiims.internal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aiims.internal.entity.PersonDetails;

public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Integer>{
	
	@Query("select h from PersonDetails h")
	public List<PersonDetails> fetchPersonDetails();
}
