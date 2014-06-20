package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudyClass;

@Repository
public interface StudyClassRepository extends MongoRepository<StudyClass, String> {

}
