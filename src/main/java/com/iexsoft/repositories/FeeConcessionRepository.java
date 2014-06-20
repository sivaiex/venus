package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.FeeConcession;

@Repository
public interface FeeConcessionRepository extends MongoRepository<FeeConcession, String> {

}
