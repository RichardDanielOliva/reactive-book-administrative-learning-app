package com.indra.reactiveAdministrativeBook.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.indra.reactiveAdministrativeBook.presentation.dtos.BookClient;

import reactor.core.publisher.Flux;

@Service
public class WebClienteAdministrativeBookAppImp {
	private final String BASE_URL_ADMINISTRATIVE_BOOK_APP = "http://localhost:8080/AdministrativeBooksApp/publicBook/api";
	private final WebClient WEB_CLIENT;
	
	@Autowired
	public WebClienteAdministrativeBookAppImp(WebClient.Builder webClientBuilder) {
		this.WEB_CLIENT = webClientBuilder.baseUrl(BASE_URL_ADMINISTRATIVE_BOOK_APP)
				.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
				.defaultHeader(HttpHeaders.ACCEPT, "application/json")
				.build();
	}
	
	public Flux<BookClient> findAll() {
		return this.WEB_CLIENT.get().uri("/books")
					.retrieve().bodyToFlux(BookClient.class)
					.map(bookClient -> {
						bookClient.setOrigin("AdministrativeBooksApp Rest Api");
						return bookClient;
						});
	}
	

}
