package com.indra.reactiveAdministrativeBook.persistence.facades;

import java.util.List;

import com.indra.reactiveAdministrativeBook.persistence.entities.Book;
import com.indra.reactiveAdministrativeBook.persistence.repositories.AuthorRepository;
import com.indra.reactiveAdministrativeBook.persistence.repositories.BookRepository;
import com.indra.reactiveAdministrativeBook.persistence.repositories.CategoryRepository;

public interface Repositories {
	
	BookRepository getBooks();
	void setBooks(BookRepository books);
	CategoryRepository getCategories();
	void setCategories(CategoryRepository categories);
	AuthorRepository getAuthors();
	void setAuthors(AuthorRepository authors);
}
