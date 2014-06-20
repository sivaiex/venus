package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.FeeType;

@Repository
public interface FeeTypeRepository extends MongoRepository<FeeType, String> {

}
