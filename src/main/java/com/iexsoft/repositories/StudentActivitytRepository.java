package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentNotes;

@Repository
public interface StudentActivitytRepository extends MongoRepository<StudentNotes, String> {
	public List<StudentNotes> findByStudent(String student);

}
