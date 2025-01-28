package com.xworkz.shop.runner;

import com.xworkz.shop.things.ShopDetails;
import com.xworkz.shop.things.ShopOperation;

public class ShopDetailsRunner {

	public static void main(String[] args) {

		
		ShopDetails details=new ShopDetails();
		
		details.setShopId(1);
		details.setName("Dmart");
		details.setOwnerName("xyz");
		details.setGstNo("ggf53675565675676");
		details.setMobileNo(5467445474l);
		
		ShopOperation operation=new ShopOperation();
		String shopDetailsOpration = operation.shopDetailsOpration(details);
		System.out.println("shopDetailsOpration : "+shopDetailsOpration);
		
		System.out.println("======update operation======");
		ShopDetails updateDetails = new ShopDetails();
		ShopDetails.setProductCode();

	}

}
