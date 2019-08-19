package com.indra.reactiveAdministrativeBook.persistence.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rating {
	@Id
	private String id;
	private double globalRating;
	private double amazonBestSellerRank;
	private double goodreads;
	private boolean bestseller;
	private String awardWinner;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGlobalRating() {
		return globalRating;
	}
	public void setGlobalRating(double globalRating) {
		this.globalRating = globalRating;
	}
	public double getAmazonBestSellerRank() {
		return amazonBestSellerRank;
	}
	public void setAmazonBestSellerRank(double amazonBestSellerRank) {
		this.amazonBestSellerRank = amazonBestSellerRank;
	}
	public double getGoodreads() {
		return goodreads;
	}
	public void setGoodreads(double goodreads) {
		this.goodreads = goodreads;
	}
	public boolean isBestseller() {
		return bestseller;
	}
	public void setBestseller(boolean bestseller) {
		this.bestseller = bestseller;
	}
	public String getAwardWinner() {
		return awardWinner;
	}
	public void setAwardWinner(String awardWinner) {
		this.awardWinner = awardWinner;
	}
	
}
