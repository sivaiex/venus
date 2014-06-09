package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.Subject;

public interface SubjectRepository extends MongoRepository<Subject, String> {

}
