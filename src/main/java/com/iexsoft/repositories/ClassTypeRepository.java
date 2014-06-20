package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.ClassType;

@Repository
public interface ClassTypeRepository extends MongoRepository<ClassType, String> {

}
