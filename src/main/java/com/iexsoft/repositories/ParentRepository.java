package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.Parent;

@Repository
public interface ParentRepository extends MongoRepository<Parent, String> {
	List<Parent> findByLastName(String lastName);

	List<Parent> findByFirstName(String firstName);

	List<Parent> findByPrimaryPhone(String primaryPhone);

	List<Parent> findByMobilePhone(String mobilePhone);
}
