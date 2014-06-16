package com.iexsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iexsoft.domain.StudentPromotion;
@Repository
public interface StudentPromotionRepository extends MongoRepository<StudentPromotion, String> {

}
