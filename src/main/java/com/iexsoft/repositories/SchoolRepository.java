package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.School;

@Repository
public interface SchoolRepository extends MongoRepository<School, String> {
	List<School> findByName(String name);

}
