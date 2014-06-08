package com.iexsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.iexsoft.repositories.SchoolRepository;
import com.iexsoft.repositories.StudentRepository;

@Service
public class DomainService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SchoolRepository schoolRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	/*
	 *  all the getter methods to repositories
	 */
	public StudentRepository getStudentRepository(){
		return studentRepository;
	}
	
	public SchoolRepository getSchoolRepository(){
		return schoolRepository;
	}

}
