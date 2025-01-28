package com.xworkz.ecommerceapplication.dto;

import java.util.Objects;

public class ProductDto {
	
	private int productCode;
	private String productName;
	public ProductDto(int productCode, String productName) {
		super();
		this.productCode = productCode;
		this.productName = productName;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(productCode, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDto other = (ProductDto) obj;
		return productCode == other.productCode && Objects.equals(productName, other.productName);
	}
	
	
}
