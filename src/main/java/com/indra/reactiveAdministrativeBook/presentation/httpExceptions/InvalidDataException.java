package com.indra.reactiveAdministrativeBook.presentation.httpExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
public class InvalidDataException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDataException(){
    }
	
	public InvalidDataException(String message){
        super(message);
    }
}
