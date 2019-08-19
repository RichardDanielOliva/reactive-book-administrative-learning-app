package com.indra.reactiveAdministrativeBook.business.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.reactiveAdministrativeBook.business.converts.BookConvert;
import com.indra.reactiveAdministrativeBook.persistence.entities.Book;
import com.indra.reactiveAdministrativeBook.persistence.facades.Repositories;
import com.indra.reactiveAdministrativeBook.presentation.dtos.BookClient;
import com.indra.reactiveAdministrativeBook.presentation.httpExceptions.ResourceNotFoundException;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class BookDataBaseServiceImpl{
	@Autowired
	Repositories repositories;
	
	@Autowired
	BookConvert bookConvert;

	public Flux<BookClient> findAll() {
		return repositories.getBooks().findAll().map(bookConvert::booksEntityToDtoClient);
	}
	
	public Mono<BookClient> findById(String bookId) throws ResourceNotFoundException {
		if(repositories.getBooks().existsById(bookId).block()) 
			return repositories.getBooks().findById(bookId).map(bookConvert::booksEntityToDtoClient);
		else 
			throw new ResourceNotFoundException();
	}
	
	public Mono<BookClient> update(BookClient book, String bookId) throws ResourceNotFoundException {
		if(repositories.getBooks().existsById(bookId).block()) {
			return insert(book);
		} else 
			throw new ResourceNotFoundException();
	}
	
	public Mono<BookClient> insert(BookClient book) {
		Book bookToInsert = bookConvert.booksDtoClientToEntity(book);
		repositories.getBooks().save(bookToInsert);
		return Mono.just(bookConvert.booksEntityToDtoClient(bookToInsert));
	}
	
	public void delete(String searchBookId) throws ResourceNotFoundException{
		Optional<Book> bookToDelete= repositories.getBooks().findById(searchBookId).blockOptional();
		
		if(bookToDelete.isPresent()) {
			repositories.getBooks().deleteById(searchBookId).block();
		}
		else 
			throw new ResourceNotFoundException("Book not found for this id: " + searchBookId);
	}



}
