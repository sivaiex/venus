package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.School;

public interface SchoolRepository extends MongoRepository<School, String>{
	List<School> findByName(String name);
	
}
