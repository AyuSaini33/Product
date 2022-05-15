package com.product.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dimensions {
      
	  Float height;
      Float length;
      Float Breadth;
	
      
      public Dimensions() {
		super();
	  }


	public Dimensions(Float height, Float length, Float breadth) {
		super();
		this.height = height;
		this.length = length;
		Breadth = breadth;
	}


	public Float getHeight() {
		return height;
	}


	public void setHeight(Float height) {
		this.height = height;
	}


	public Float getLength() {
		return length;
	}


	public void setLength(Float length) {
		this.length = length;
	}


	public Float getBreadth() {
		return Breadth;
	}


	public void setBreadth(Float breadth) {
		Breadth = breadth;
	}
      
      
      
      
      
}
