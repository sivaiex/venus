package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.secondaries.PhotoType;

@Repository
public interface PhotoTypeRepository extends MongoRepository<PhotoType, String> {
	List<PhotoType> findByType(String type);

}
