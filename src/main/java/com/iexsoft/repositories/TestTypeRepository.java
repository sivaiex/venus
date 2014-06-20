package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.TestType;

@Repository
public interface TestTypeRepository extends MongoRepository<TestType, String> {

}
