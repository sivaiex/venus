package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentAttendance;

@Repository
public interface StudentAttendanceRepository extends MongoRepository<StudentAttendance, String> {
	public List<StudentAttendance> findByStudent(String student);

}
