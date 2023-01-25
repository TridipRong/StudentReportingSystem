package com.salesken.test.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalExceptions {


	
	@ExceptionHandler(StudentExceptions.class)
	public ResponseEntity<MyErrorDetails> studentExceptionHandler(StudentExceptions se, WebRequest req){
		
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimeStamp(LocalDateTime.now());
			err.setMessage(se.getMessage());
			err.setHttpStatus(HttpStatus.NOT_FOUND);
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(SubjectExceptions.class)
	public ResponseEntity<MyErrorDetails> subjectExceptionHandler(SubjectExceptions se, WebRequest req){
		
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimeStamp(LocalDateTime.now());
			err.setMessage(se.getMessage());
			err.setHttpStatus(HttpStatus.NOT_FOUND);
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.NOT_FOUND);
	}
}
