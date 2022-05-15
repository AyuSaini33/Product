package com.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.product.dtos.ProductDto;
import com.product.dtos.ProductDetails;
import com.product.dtos.ProductDto;
import com.product.dtos.SellerProductDto;
import com.product.entity.Product;
import com.product.exception.CustomException;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository productRepository;
	
	public void addProduct(ProductDto prod) throws CustomException{
            productRepository.save(ProductDto.createEntity(prod));
	}
	
	
	public ProductDto findProductByName(String prodName) throws CustomException{
		Optional<Product> product = productRepository.findByProductName(prodName);
		if(product.isPresent()) {
			Product productEntity = product.get();
			//rest Template call
//			List<SellerProductDto> listOfSellerDetails = new ArrayList<>();
			ProductDto productDto = Product.createDto(productEntity);
			return productDto;
		}else {
			throw new CustomException("Product Doesn't exist");
		}
	}
	
//	public ProductDetails findProductByProductId(String prodId) throws CustomException {
//		Optional<Product1> product = productRepository.findById(prodId);
//		if(product.isPresent()) {
//			Product1 productEntity = product.get();
//			//rest Template call
//			List<SellerProductDto> listOfSellerDetails = new ArrayList<>();
//			ProductDetails productDetails = new ProductDetails(Product1.createProductDto(productEntity) , listOfSellerDetails);
//			return productDetails;		
//		}else {
//		     throw new CustomException("Product with this productId Doesn't exist");	
//		}
//	}
	
	public void updateProductRating(String prodId, Integer rating) throws CustomException {
		Optional<Product> product = productRepository.findById(prodId);
		if(product.isPresent()) {
			Product productEntity = product.get();
			Integer oldRating  = productEntity.getRating();
			Integer newRatings = oldRating + rating;
			Integer newNumberOfRatings = productEntity.getNumberOfRatings() + 1;
			productEntity.setRating(newRatings);
			productEntity.setNumberOfRatings(newNumberOfRatings);
			productRepository.save(productEntity);
		}else {
		     throw new CustomException("Product with this productId Doesn't exist");	
		}
	}
	
}
