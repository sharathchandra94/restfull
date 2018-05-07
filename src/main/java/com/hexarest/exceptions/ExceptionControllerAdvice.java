package com.hexarest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hexarest.errorresponse.EmployyeErrorResponse;

@ControllerAdvice
public class ExceptionControllerAdvice {
 
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<EmployyeErrorResponse> exceptionHandler(Exception ex) {
		EmployyeErrorResponse error = new EmployyeErrorResponse();
		error.setErrorcode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setErrormsg(ex.getMessage());
		return new ResponseEntity<EmployyeErrorResponse>(error, HttpStatus.OK);
	}
	
}
