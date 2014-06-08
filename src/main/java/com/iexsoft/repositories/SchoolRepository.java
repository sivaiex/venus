package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.School;
import com.iexsoft.domain.Student;

public interface SchoolRepository extends MongoRepository<School, String>{
	List<Student> findByName(String name);
	
}
