package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.Student;
@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
	List<Student> findByLastName(String lastName);
}
