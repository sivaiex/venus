package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.StudentAttendanceStatus;

public interface StudentAttendanceStatusRepository extends MongoRepository<StudentAttendanceStatus, String> {

}
