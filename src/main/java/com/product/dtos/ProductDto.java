package com.product.dtos;


import com.product.entity.Product;
import com.product.dtos.ProductDetails;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ProductDto {

	String productId;
	String productName;
	Integer rating;
	Integer numberOfRatings;
	
	ProductDetails productDetails;
	Dimensions dimensions;
	
    public ProductDto() {
		super();
	}


	public ProductDto(String productId, String productName, Integer rating, Integer numberOfRatings,
			ProductDetails productDetails, Dimensions dimensions) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.rating = rating;
		this.numberOfRatings = numberOfRatings;
		this.productDetails = productDetails;
		this.dimensions = dimensions;
	}



	public String getProductId() {
		return productId;
	}



	public void setProductId(String productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Integer getRating() {
		return rating;
	}



	public void setRating(Integer rating) {
		this.rating = rating;
	}



	public Integer getNumberOfRatings() {
		return numberOfRatings;
	}



	public void setNumberOfRatings(Integer numberOfRatings) {
		this.numberOfRatings = numberOfRatings;
	}



	public ProductDetails getProductDetails() {
		return productDetails;
	}



	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}



	public Dimensions getDimensions() {
		return dimensions;
	}



	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}



	public static Product createEntity(ProductDto prod) {
   	   return new Product(prod.getProductName(), prod.getRating() , prod.getNumberOfRatings() , new ProductDetails(prod.getProductDetails().getDescription(), prod.getProductDetails().getBrandName(), prod.getProductDetails().getMrp(), prod.getProductDetails().getWeight(), prod.getProductDetails().getQuantity(),
   			prod.getProductDetails().getOrigin(), prod.getProductDetails().getScent(), prod.getProductDetails().getItemForm(), prod.getProductDetails().getSpecificUse(), prod.getProductDetails().getModelName(), prod.getProductDetails().getColour(),
   			prod.getProductDetails().getDisplaySize(), prod.getProductDetails().getRamSize(), prod.getProductDetails().getRomSize(), prod.getProductDetails().getOperatingSystem(),
   			prod.getProductDetails().getAverageBatteryStandbyLife(), prod.getProductDetails().getDepartment(), prod.getProductDetails().getFabric()) , new Dimensions(prod.getDimensions().getHeight(), prod.getDimensions().getLength(), prod.getDimensions().getBreadth()));
    }
	
	
}
