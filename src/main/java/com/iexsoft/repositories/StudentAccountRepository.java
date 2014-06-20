package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentAccount;
@Repository
public interface StudentAccountRepository extends MongoRepository<StudentAccount, String> {
	public List<StudentAccount> findByStudent(String student);

}
