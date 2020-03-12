package com.rush.exception;
/*
 * Unused for now, but can be used to handle exceptions for controllers, user defined exception here that could be used 
 * in GlobalExceptionHandler
 * google @ControllerAdvice for more details
 */



import org.springframework.http.ResponseEntity;



public class ValidateSessionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    

    public ValidateSessionException() {

    }
 
 
    public ResponseEntity getErrMsg() {
		return ResponseEntity
				.status(404)
				.body("Resource not found");
    }

 


}
