package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.Staff;

public interface StaffRepository extends MongoRepository<Staff, String> {

}
