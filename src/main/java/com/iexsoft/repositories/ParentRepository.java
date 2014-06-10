package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.Parent;

public interface ParentRepository extends MongoRepository<Parent, String> {

}
