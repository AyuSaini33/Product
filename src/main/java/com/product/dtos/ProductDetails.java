package com.product.dtos;

import java.util.List;

import com.product.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ProductDetails {

//	General product details
     String description;
     String brandName;
     Integer mrp;
     Float weight;
     Integer quantity;
     String origin;
     
//  Detergent
     String scent;
     String itemForm;
     String specificUse;
     
//  Technical Product
     String modelName;
     String colour;
     String displaySize;	
     Integer ramSize;
     Integer romSize;
     String operatingSystem;
     String averageBatteryStandbyLife;
	
//  Shoes
     String department;
     
//  clothes
     String Fabric;

	public ProductDetails() {
		super();
	}

	public ProductDetails(String description, String brandName, Integer mrp, Float weight, Integer quantity,
			String origin, String scent, String itemForm, String specificUse, String modelName, String colour,
			String displaySize, Integer ramSize, Integer romSize, String operatingSystem,
			String averageBatteryStandbyLife, String department, String fabric) {
		super();
		this.description = description;
		this.brandName = brandName;
		this.mrp = mrp;
		this.weight = weight;
		this.quantity = quantity;
		this.origin = origin;
		this.scent = scent;
		this.itemForm = itemForm;
		this.specificUse = specificUse;
		this.modelName = modelName;
		this.colour = colour;
		this.displaySize = displaySize;
		this.ramSize = ramSize;
		this.romSize = romSize;
		this.operatingSystem = operatingSystem;
		this.averageBatteryStandbyLife = averageBatteryStandbyLife;
		this.department = department;
		Fabric = fabric;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getMrp() {
		return mrp;
	}

	public void setMrp(Integer mrp) {
		this.mrp = mrp;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}

	public String getItemForm() {
		return itemForm;
	}

	public void setItemForm(String itemForm) {
		this.itemForm = itemForm;
	}

	public String getSpecificUse() {
		return specificUse;
	}

	public void setSpecificUse(String specificUse) {
		this.specificUse = specificUse;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public Integer getRamSize() {
		return ramSize;
	}

	public void setRamSize(Integer ramSize) {
		this.ramSize = ramSize;
	}

	public Integer getRomSize() {
		return romSize;
	}

	public void setRomSize(Integer romSize) {
		this.romSize = romSize;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getAverageBatteryStandbyLife() {
		return averageBatteryStandbyLife;
	}

	public void setAverageBatteryStandbyLife(String averageBatteryStandbyLife) {
		this.averageBatteryStandbyLife = averageBatteryStandbyLife;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFabric() {
		return Fabric;
	}

	public void setFabric(String fabric) {
		Fabric = fabric;
	} 
     

     
     
     
     
     
}
