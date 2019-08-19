package com.indra.reactiveAdministrativeBook.persistence.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.indra.reactiveAdministrativeBook.persistence.entities.enums.Language;


@Document
public class Book {
	@Id
	private String id;
	private String title;
	private Date publicationDate;
	private long ISBN10;
	@Indexed
	private long ISBN13;
	private int numPage;
	private String format;
	private String edition;
	
	
	private Language publicationLanguage;

	private Language translateLanguage;
	private String imgUrl;
	
	@DBRef
	private Description description;
	
	@DBRef
	private Rating rating;
	
	@DBRef
	private Publisher publisher;
	
	@Field("Autores")
	@DBRef
	private Set<Author> authors;
	
	@DBRef
	private Set<Category> categories;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public long getISBN10() {
		return ISBN10;
	}

	public void setISBN10(long iSBN10) {
		ISBN10 = iSBN10;
	}

	public long getISBN13() {
		return ISBN13;
	}

	public void setISBN13(long iSBN13) {
		ISBN13 = iSBN13;
	}

	public int getNumPage() {
		return numPage;
	}

	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Language getPublicationLanguage() {
		return publicationLanguage;
	}

	public void setPublicationLanguage(Language publicationLanguage) {
		this.publicationLanguage = publicationLanguage;
	}

	public Language getTranslateLanguage() {
		return translateLanguage;
	}

	public void setTranslateLanguage(Language translateLanguage) {
		this.translateLanguage = translateLanguage;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	
}