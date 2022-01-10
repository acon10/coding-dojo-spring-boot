package com.assignment.spring.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<?> dataNotFoundExceptionHandling(Exception exception, WebRequest request) {
		return new ResponseEntity<>(
				new ExceptionDetail(LocalDate.now(), exception.getMessage(), request.getDescription(false)),
				HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalExceptionHandling(Exception exception, WebRequest request) {
		return new ResponseEntity<>(
				new ExceptionDetail(LocalDate.now(), exception.getMessage(), request.getDescription(false)),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
