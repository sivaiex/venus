package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.StaffType;

public interface StaffTypeRepository extends MongoRepository<StaffType, String> {

}
