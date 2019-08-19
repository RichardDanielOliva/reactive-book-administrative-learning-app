package com.indra.reactiveAdministrativeBook.presentation.services;

import java.util.List;

import com.indra.reactiveAdministrativeBook.persistence.entities.Book;
import com.indra.reactiveAdministrativeBook.presentation.dtos.BookClient;
import com.indra.reactiveAdministrativeBook.presentation.httpExceptions.ResourceNotFoundException;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookServices {
	Mono<BookClient> findById(String idBook) throws ResourceNotFoundException;
	
	Flux<BookClient> findAll();

	void delete(String idBook) throws ResourceNotFoundException;

	Mono<BookClient> update(BookClient book, String bookId) throws ResourceNotFoundException;

	Mono<BookClient> insert(BookClient book);
}
