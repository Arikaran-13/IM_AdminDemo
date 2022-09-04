package com.zensar.im.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidCandidateIdException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	String message;
	public InvalidCandidateIdException() {
		this.message="";
		}
	public InvalidCandidateIdException(String msg) {
		this.message=msg;
	}
	
	public String toString() {
		return "Invalid Candidate Id: " + message;
	}

}
