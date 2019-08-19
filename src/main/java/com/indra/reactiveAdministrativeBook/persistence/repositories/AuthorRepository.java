package com.indra.reactiveAdministrativeBook.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.indra.reactiveAdministrativeBook.persistence.entities.Author;

import reactor.core.publisher.Mono;

@Repository
public interface AuthorRepository extends ReactiveMongoRepository<Author, String>{
	Mono<Author> findByNameAndLastname(String name, String lastname);
}
