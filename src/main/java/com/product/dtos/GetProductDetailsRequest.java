package com.product.dtos;

import java.util.List;

public class GetProductDetailsRequest {

	List<String> productIds;
	
	public GetProductDetailsRequest() {
		
	}

	public GetProductDetailsRequest(List<String> productIds) {
		this.productIds = productIds;
	}
	
    public List<String> getProductIds(){
    	return productIds;
    }
    
    public void setProductIds(List<String> productIds) {
    	this.productIds = productIds;
    }
	
	
	
}
