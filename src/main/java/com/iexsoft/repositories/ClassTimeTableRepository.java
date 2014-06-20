package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.ClassTimetable;

@Repository
public interface ClassTimeTableRepository extends MongoRepository<ClassTimetable, String> {

}
