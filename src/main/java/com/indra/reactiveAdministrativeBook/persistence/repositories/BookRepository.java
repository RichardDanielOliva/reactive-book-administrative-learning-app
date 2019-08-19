package com.indra.reactiveAdministrativeBook.persistence.repositories;

import java.util.Date;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.indra.reactiveAdministrativeBook.persistence.entities.Book;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {
	Flux<Book> findByPublicationDateAfter(Date fechaBusqueda);
	Flux<Book> findByPublicationDateBefore(Date fechaBusqueda);
	Flux<Book> findByPublicationDate(Date fechaBusqueda);
	Mono<Book> findById(int id);
}
