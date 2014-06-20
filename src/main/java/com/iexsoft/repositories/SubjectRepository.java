package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.Subject;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {

}
