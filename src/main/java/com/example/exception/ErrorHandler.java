package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> generalException(Exception e) throws Exception{
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorMessage.setErrorMessage(e.getMessage());
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ExampleException.class)
	public ResponseEntity<ErrorMessage> customException(ExampleException e) throws Exception{
		return new ResponseEntity<ErrorMessage>(e.getErrorMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
