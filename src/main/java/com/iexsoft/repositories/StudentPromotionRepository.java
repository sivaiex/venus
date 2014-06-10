package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iexsoft.domain.StudentPromotion;

public interface StudentPromotionRepository extends MongoRepository<StudentPromotion, String> {

}
