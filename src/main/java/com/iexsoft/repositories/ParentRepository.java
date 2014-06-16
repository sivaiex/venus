package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.Parent;
@Repository
public interface ParentRepository extends MongoRepository<Parent, String> {

}
