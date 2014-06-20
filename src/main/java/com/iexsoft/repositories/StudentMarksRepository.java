package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentMarks;

@Repository
public interface StudentMarksRepository extends MongoRepository<StudentMarks, String> {
	public List<StudentMarks> findByStudent(String student);
}
