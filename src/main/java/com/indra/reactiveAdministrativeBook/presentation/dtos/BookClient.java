package com.indra.reactiveAdministrativeBook.presentation.dtos;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class BookClient {
	//private int bookId;
	
	private String title;
	
	private Date publicationDate;
	
	private String origin;
	private long ISBN10;
	private long ISBN13;
	private int numPage;
	private String format;
	private String imgUrl;
	private int descriptionId;
	private int publisherId;
	private List<Integer> idAuthors;
	private List<Integer> categoriesId;
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
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getDescriptionId() {
		return descriptionId;
	}
	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public List<Integer> getIdAuthors() {
		return idAuthors;
	}
	public void setIdAuthors(List<Integer> idAuthors) {
		this.idAuthors = idAuthors;
	}
	public List<Integer> getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(List<Integer> categoriesId) {
		this.categoriesId = categoriesId;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
