package com.aiims.internal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aiims.internal.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	
	@Query("select distinct(h.name) from Hpspital h;")
	public List<String> fetchHospitalNames();
}
