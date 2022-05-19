package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.constants.ResponseCode;
import com.product.dtos.ProductDto;
import com.product.dtos.GetProductDetailsRequest;
import com.product.dtos.GetProductDetailsResponse;
import com.product.dtos.ProductDetails;
import com.product.dtos.Response;
import com.product.exception.CustomException;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;
	
	
	@PostMapping(value="/add-product")
	public void addProduct(@RequestBody ProductDto prod) throws CustomException{
         productService.addProduct(prod);
	}
	
	@GetMapping(value = "/getProduct")
	public ResponseEntity<GetProductDetailsResponse> getProductNames(@RequestBody GetProductDetailsRequest getProductDetailsRequest) 
			throws CustomException{
		GetProductDetailsResponse prodNames = productService.getProductNames(getProductDetailsRequest);
	    return new ResponseEntity<>(prodNames , HttpStatus.OK);
	}

	@GetMapping(value = "/find-product-by-name/{prodName}")
	public ResponseEntity<ProductDto> findProductByName(@PathVariable("prodName") String prodName) throws CustomException{
		ProductDto prodDetails = productService.findProductByName(prodName);
	    return new ResponseEntity<>(prodDetails , HttpStatus.OK);
	}
	
//	@GetMapping(value = "/find-product-by-id/{prodId}")
//	public ResponseEntity<ProductDetails> findProductByProductId(@PathVariable("prodId") String prodId) throws CustomException{
//		ProductDetails prodDetails = productService.findProductByName(prodId);
//	    return new ResponseEntity<>(prodDetails , HttpStatus.OK);
//	}
	
	@PutMapping(value = "update-product-rating/{prodId}/{rating}")
	public ResponseEntity<Response> updateProductRating(@PathVariable("prodId") String prodId , @PathVariable("rating") Integer rating) throws CustomException{
		productService.updateProductRating(prodId, rating);
		Response response = new Response(ResponseCode.Success,  HttpStatus.OK.value(), null);
		return new ResponseEntity<>(response , HttpStatus.OK);
	}
	
	
	
}
