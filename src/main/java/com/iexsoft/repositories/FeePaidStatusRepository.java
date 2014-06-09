package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.FeePaidStatus;

public interface FeePaidStatusRepository extends MongoRepository<FeePaidStatus, String> {

}
