package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.ClassType;

public interface StaffTypeRepository extends MongoRepository<ClassType, String> {

}
