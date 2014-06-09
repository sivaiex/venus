package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.FeeConcession;

public interface FeeConcessionRepository extends MongoRepository<FeeConcession, String> {

}
