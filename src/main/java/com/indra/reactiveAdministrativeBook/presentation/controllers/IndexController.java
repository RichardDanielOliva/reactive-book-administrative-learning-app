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
public class IndexController {
	
	private final BookServices booksService;

	@Autowired
	public IndexController(BookServices booksService) {
        this.booksService = booksService;
    }
	
	 @RequestMapping({"", "/", "/index"})
	 public String getIndexPage(Model model) {
		 IReactiveDataDriverContextVariable reactiveDataDrivenMode =
	                new ReactiveDataDriverContextVariable(booksService.findAll(), 1);
		 
	     model.addAttribute("books", reactiveDataDrivenMode);
	      
	     return "index";
	    }

	 
}
