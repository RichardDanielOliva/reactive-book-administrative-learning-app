package com.indra.reactiveAdministrativeBook.persistence.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.indra.reactiveAdministrativeBook.persistence.entities.enums.Gender;

@Document
public class Author {
	@Id
	private String id;
	private String name;
	private String lastname;
	private Date birthdate;
	private Gender gender;
	private String nationality;
	private String shortBiography;
	
	@DBRef
	private Set<Book> books;
	private String fullNameAuthor;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getShortBiography() {
		return shortBiography;
	}
	public void setShortBiography(String shortBiography) {
		this.shortBiography = shortBiography;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public String getFullNameAuthor() {
		return fullNameAuthor;
	}
	public void setFullNameAuthor(String fullNameAuthor) {
		this.fullNameAuthor = fullNameAuthor;
	}
	
	
}
