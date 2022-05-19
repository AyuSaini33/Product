package com.product.dtos;

import java.util.List;

public class GetProductDetailsResponse {

 List<String> productNames;
 
 public GetProductDetailsResponse() {
	 
 }
	
 
 public GetProductDetailsResponse(List<String> productNames) {
	 this.productNames = productNames;
 }
 
 public List<String> getProductNames(){
 	return productNames;
 }
 
 public void setProductNames(List<String> productNames) {
 	this.productNames = productNames;
 }
 
}