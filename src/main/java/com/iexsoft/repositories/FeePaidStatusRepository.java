package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.FeePaidStatus;

@Repository
public interface FeePaidStatusRepository extends MongoRepository<FeePaidStatus, String> {

}
