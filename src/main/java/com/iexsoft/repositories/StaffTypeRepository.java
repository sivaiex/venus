package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.StaffType;

@Repository
public interface StaffTypeRepository extends MongoRepository<StaffType, String> {

}
