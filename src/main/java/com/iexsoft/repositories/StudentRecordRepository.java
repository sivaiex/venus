package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.StudentRecord;

public interface StudentRecordRepository extends MongoRepository<StudentRecord, String> {

}
