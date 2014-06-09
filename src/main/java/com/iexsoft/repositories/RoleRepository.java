package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.secondaries.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

}
