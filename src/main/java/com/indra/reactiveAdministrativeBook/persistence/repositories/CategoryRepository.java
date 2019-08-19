package com.indra.reactiveAdministrativeBook.persistence.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.indra.reactiveAdministrativeBook.persistence.entities.Category;

@Repository
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
