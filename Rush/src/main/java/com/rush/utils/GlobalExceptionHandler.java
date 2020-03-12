/*
 * Unused for now, but can be used to handle exceptions for controllers 
 * google @ControllerAdvice for more details
 */

package com.rush.utils;




import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.auth0.jwt.interfaces.Claim;
import com.rush.exception.ValidateSessionException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
    @ExceptionHandler(ValidateSessionException.class)
    public ResponseEntity handleMyException(ValidateSessionException InvJwtExcept) {
    	return InvJwtExcept.getErrMsg();
    }
 

    
}