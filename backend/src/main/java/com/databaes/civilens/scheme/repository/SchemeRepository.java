package com.databaes.civilens.scheme.repository;

import com.databaes.civilens.scheme.model.Scheme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemeRepository extends MongoRepository<Scheme, String> {
}
