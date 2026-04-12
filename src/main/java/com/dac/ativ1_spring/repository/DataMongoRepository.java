package com.dac.ativ1_spring.repository;

import com.dac.ativ1_spring.model.ModelMongoDB;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataMongoRepository extends MongoRepository<ModelMongoDB, String> {
}
