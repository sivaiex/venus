package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.Photo;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {
	List<Photo> findByType(String type);

}
