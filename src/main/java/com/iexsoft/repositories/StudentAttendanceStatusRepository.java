package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.StudentAttendanceStatus;

@Repository
public interface StudentAttendanceStatusRepository extends MongoRepository<StudentAttendanceStatus, String> {

}
