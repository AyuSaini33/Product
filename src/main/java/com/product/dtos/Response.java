package com.product.dtos;

import com.product.constants.ResponseCode;

public class Response {
 
	private ResponseCode responseCode;
	private Integer errorCode;
	private String message;
	
	public Response() {
		super();
	}

	public Response(ResponseCode responseCode, Integer errorCode, String message) {
		super();
		this.responseCode = responseCode;
		this.errorCode = errorCode;
		this.message = message;
	}

	public ResponseCode getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
