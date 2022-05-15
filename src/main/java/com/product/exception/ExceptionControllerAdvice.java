package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.product.constants.ResponseCode;
import com.product.dtos.Response;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Response> customException(CustomException ex){
		Response response = new Response(ResponseCode.Failure, HttpStatus.BAD_GATEWAY.value(), ex.getMessage());
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	
	
}
