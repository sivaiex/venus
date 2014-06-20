package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {

}
