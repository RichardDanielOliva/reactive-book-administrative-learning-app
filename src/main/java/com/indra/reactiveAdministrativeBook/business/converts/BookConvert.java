package com.indra.reactiveAdministrativeBook.business.converts;

import org.springframework.stereotype.Service;

import com.indra.reactiveAdministrativeBook.persistence.entities.Book;
import com.indra.reactiveAdministrativeBook.presentation.dtos.BookClient;

@Service
public class BookConvert {
	public BookClient booksEntityToDtoClient(Book bookToConvert) {
		BookClient bookResult = new BookClient();
		
		bookResult.setTitle(bookToConvert.getTitle());
		bookResult.setOrigin("Mongo Data Base");
		
		return bookResult;
	}
	
	public Book booksDtoClientToEntity(BookClient bookToConvert) {
		Book bookResult = new Book();
		
		bookResult.setTitle(bookToConvert.getTitle());
		
		return bookResult;
	}
}
