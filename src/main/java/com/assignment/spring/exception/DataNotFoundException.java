package com.assignment.spring.exception;

public class DataNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String message) {
        super(message);
    }
}
