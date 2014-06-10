package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.ClassTimetable;

public interface ClassTimeTableRepository extends MongoRepository<ClassTimetable, String> {

}
