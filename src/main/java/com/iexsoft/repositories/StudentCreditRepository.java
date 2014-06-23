package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentCredit;

@Repository
public interface StudentCreditRepository extends MongoRepository<StudentCredit, String> {
	public StudentCredit findByStudent(String student);

}
