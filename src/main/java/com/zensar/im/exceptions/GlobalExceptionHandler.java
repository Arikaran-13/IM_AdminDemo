package com.zensar.im.exceptions;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
      
	@ExceptionHandler(InvalidCandidateIdException.class)
	public ResponseEntity<Object>handleException(InvalidCandidateIdException exception, WebRequest webrequest){
		//ErrorDetails error = new ErrorDetails(new Date(),ex.getMessage(),webrequest.getDescription(false));
		return  handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),HttpStatus.BAD_REQUEST,webrequest);
		
	}
}
