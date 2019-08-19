package com.indra.reactiveAdministrativeBook.persistence.facades;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.indra.reactiveAdministrativeBook.persistence.entities.Author;
import com.indra.reactiveAdministrativeBook.persistence.entities.Book;
import com.indra.reactiveAdministrativeBook.persistence.repositories.AuthorRepository;
import com.indra.reactiveAdministrativeBook.persistence.repositories.BookRepository;
import com.indra.reactiveAdministrativeBook.persistence.repositories.CategoryRepository;

@Service
public class RepositoriesImp implements Repositories{
	@Autowired  
	BookRepository books;
	@Autowired
	CategoryRepository categories;
	@Autowired
	AuthorRepository authors;
	
	
	
	@Override
	public BookRepository getBooks() {
		return books;
	}
	@Override
	public void setBooks(BookRepository books) {
		this.books = books;
	}
	@Override
	public CategoryRepository getCategories() {
		return categories;
	}
	@Override
	public void setCategories(CategoryRepository categories) {
		this.categories = categories;
	}
	@Override
	public AuthorRepository getAuthors() {
		return authors;
	}
	@Override
	public void setAuthors(AuthorRepository authors) {
		this.authors = authors;
	}	
	

}
