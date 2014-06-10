package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.StudyClass;

public interface StudyClassRepository extends MongoRepository<StudyClass, String> {

}
