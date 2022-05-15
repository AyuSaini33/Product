package com.product.dtos;

public class SellerProductDto {
	
	String sellerProductId;
	String productId;
	String sellerId;
	Float price;
	Integer quantity;
	
	
	public SellerProductDto() {
		super();
	}

	public SellerProductDto(String sellerProductId, String productId, String sellerId, Float price, Integer quantity) {
		super();
		this.sellerProductId = sellerProductId;
		this.productId = productId;
		this.sellerId = sellerId;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getSellerProductId() {
		return sellerProductId;
	}
	public void setSellerProductId(String sellerProductId) {
		this.sellerProductId = sellerProductId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

}
