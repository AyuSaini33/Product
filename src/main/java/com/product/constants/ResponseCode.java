package com.product.constants;

public enum ResponseCode {
    Success(1), Failure(0);
    private int responseCode;
    ResponseCode(int responseCode){
    	this.responseCode = responseCode;
    }
    
    public int getResponseCode() {
    	return responseCode;
    }
}
