package com.iexsoft.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentPromotion;

@Repository
public interface StudentPromotionRepository extends MongoRepository<StudentPromotion, String> {
	public List<StudentPromotion> findByStudent(String student);
}
