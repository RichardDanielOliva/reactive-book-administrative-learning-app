package com.indra.reactiveAdministrativeBook.persistence.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Description {
	@Id
	private String id;
	private String coreConcept;
	private String endoresement;
	private String backCover;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCoreConcept() {
		return coreConcept;
	}
	public void setCoreConcept(String coreConcept) {
		this.coreConcept = coreConcept;
	}
	public String getEndoresement() {
		return endoresement;
	}
	public void setEndoresement(String endoresement) {
		this.endoresement = endoresement;
	}
	public String getBackCover() {
		return backCover;
	}
	public void setBackCover(String backCover) {
		this.backCover = backCover;
	}
	@Override
	public String toString() {
		return "Description [id=" + id + ", coreConcept=" + coreConcept + ", endoresement=" + endoresement
				+ ", backCover=" + backCover + "]";
	}
	
	
}
