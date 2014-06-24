package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.MediumType;

@Repository
public interface MediumTypeRepository extends MongoRepository<MediumType, String> {

}
