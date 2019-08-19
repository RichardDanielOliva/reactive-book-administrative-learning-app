package com.indra.reactiveAdministrativeBook.persistence.entities;


import java.util.Date;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Publisher {
	@Id
	private String id;
	private String founder;
	private String name;
	private String website;
	private String location;

	@DBRef
	private Publisher group;

	private Date dateFounder;
	
	@DBRef
	private Set<Book> books;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Publisher getGroup() {
		return group;
	}
	public void setGroup(Publisher group) {
		this.group = group;
	}
	public Date getDateFounder() {
		return dateFounder;
	}
	public void setDateFounder(Date dateFounder) {
		this.dateFounder = dateFounder;
	}
	private Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", founder=" + founder + ", name=" + name + ", website=" + website
				+ ", location=" + location + ", dateFounder=" + dateFounder + "]";
	}
	
	
}
