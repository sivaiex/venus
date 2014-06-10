package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.StudentAccount;

public interface StudentAccountRepository extends MongoRepository<StudentAccount, String> {

}
