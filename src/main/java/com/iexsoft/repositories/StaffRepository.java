package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.Staff;

@Repository
public interface StaffRepository extends MongoRepository<Staff, String> {

}
