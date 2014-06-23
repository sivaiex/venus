package com.iexsoft.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	List<Student> findByLastName(String lastName);

	List<Student> findByFirstName(String firstName);

	List<Student> findByDateOfBirth(Date dateOfBirth);

	Student findByadmissionNumber(String admissionNumber);

	List<Student> findByFather(String father);

	List<Student> findByMother(String mother);

	List<Student> findByClassId(String classId);

}
