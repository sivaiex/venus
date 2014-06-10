package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.StudentMarks;

public interface StudentMarksRepository extends MongoRepository<StudentMarks, String> {

}
