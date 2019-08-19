package com.indra.reactiveAdministrativeBook.presentation.controllers;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.indra.reactiveAdministrativeBook.presentation.services.BookServices;


@Controller
@RequestMapping("/books")
public class BookController {
	private final BookServices booksService;
	
	@Autowired
	public BookController(BookServices booksService) {
        this.booksService = booksService;
    }
	
	 
	 @RequestMapping({"", "/", "/index"})
	 public String getBooksFromAdministravieBook(Model model) {
		 IReactiveDataDriverContextVariable reactiveDataDrivenMode =
	                new ReactiveDataDriverContextVariable(booksService.findAll());
		 
	     model.addAttribute("books", reactiveDataDrivenMode);
	      
	     return "index";
	    }
}
