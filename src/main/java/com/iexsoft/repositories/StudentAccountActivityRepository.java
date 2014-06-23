package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentAccountActivity;

@Repository
public interface StudentAccountActivityRepository extends MongoRepository<StudentAccountActivity, String> {
	public List<StudentAccountActivity> findByStudent(String student);

}
