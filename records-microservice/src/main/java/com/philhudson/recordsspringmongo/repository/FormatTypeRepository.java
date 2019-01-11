package com.philhudson.recordsspringmongo.repository;

import com.philhudson.recordsspringmongo.model.FormatType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormatTypeRepository extends MongoRepository<FormatType, String> {

    FormatType findByDescription(String description);
}