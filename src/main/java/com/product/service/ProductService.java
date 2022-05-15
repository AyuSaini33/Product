package com.product.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.product.dtos.ProductDto;
import com.product.dtos.GetProductDetailsRequest;
import com.product.dtos.GetProductDetailsResponse;
import com.product.dtos.ProductDetails;
import com.product.exception.CustomException;


public interface ProductService {

	public ProductDetails addProduct(ProductDto prod) throws CustomException;
	public GetProductDetailsResponse getProductNames(GetProductDetailsRequest getProductDetailsRequest) throws CustomException;
//	public ProductDetails findProductByName(String prodName);
//	public void findProductByProductId(String prodId); 
//	public void updateProductRating(String prodId, Integer rating);
	
}
