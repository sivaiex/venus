package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.FeeType;

public interface FeeTypeRepository extends MongoRepository<FeeType, String> {

}
