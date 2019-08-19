package com.indra.reactiveAdministrativeBook.business.facades;

import java.time.Duration;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.reactiveAdministrativeBook.business.converts.BookConvert;
import com.indra.reactiveAdministrativeBook.business.services.BookDataBaseServiceImpl;
import com.indra.reactiveAdministrativeBook.business.services.WebClienteAdministrativeBookAppImp;
import com.indra.reactiveAdministrativeBook.persistence.entities.Book;
import com.indra.reactiveAdministrativeBook.persistence.facades.Repositories;
import com.indra.reactiveAdministrativeBook.presentation.dtos.BookClient;
import com.indra.reactiveAdministrativeBook.presentation.httpExceptions.ResourceNotFoundException;
import com.indra.reactiveAdministrativeBook.presentation.services.BookServices;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImp implements BookServices{
	@Autowired
	BookDataBaseServiceImpl BookDB;

	@Autowired
	WebClienteAdministrativeBookAppImp bookClient;

	@Override
	public Flux<BookClient> findAll() {
		Flux<BookClient> dataBaseBooks = BookDB.findAll().delayElements(Duration.ofSeconds(3));
		
		Flux<BookClient> clientBooks = bookClient.findAll().delayElements(Duration.ofSeconds(1));
		
		return Flux.merge(dataBaseBooks,clientBooks);
	}
	
	@Override
	public Mono<BookClient> findById(String idBook) throws ResourceNotFoundException {
		return BookDB.findById(idBook);
	}
	
	@Override
	public Mono<BookClient> update(BookClient book, String bookId)  throws ResourceNotFoundException{
		return BookDB.insert(book);
	}
	
	@Override
	public Mono<BookClient> insert(BookClient book) {
		return BookDB.insert(book);
	}
	@Override
	public void delete(String searchBookId) throws ResourceNotFoundException{
		BookDB.delete(searchBookId);
	}
}
