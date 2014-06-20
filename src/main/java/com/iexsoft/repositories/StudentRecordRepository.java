package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentRecord;

@Repository
public interface StudentRecordRepository extends MongoRepository<StudentRecord, String> {
	public List<StudentRecord> findByStudent(String student);
}
