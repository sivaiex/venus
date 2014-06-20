package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentActivity;
@Repository
public interface StudentActivitytRepository extends MongoRepository<StudentActivity, String> {
	public List<StudentActivity> findByStudent(String student);

}
