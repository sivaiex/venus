package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.StaffType;

public interface ClassTypeRepository extends MongoRepository<StaffType, String> {

}
