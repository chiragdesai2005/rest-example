package com.example.exception;

public class ExampleException extends RuntimeException {

	
	private static final long serialVersionUID = -7102230518591138743L;
	private ErrorMessage errorMessage;
	
	
	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}


	public ExampleException(String message) {
		super(message);
	}
	
	

}
