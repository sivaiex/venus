package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.Fee;

public interface FeeRepository extends MongoRepository<Fee, String> {

}
