package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.TestType;

public interface TestTypeRepository extends MongoRepository<TestType, String> {

}
