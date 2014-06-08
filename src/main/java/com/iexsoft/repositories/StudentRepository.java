package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
	List<Student> findByLastName(String lastName);
}
