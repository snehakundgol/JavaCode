package com.xworkz.house.runner;

import com.xworkz.house.things.HouseDetails;
import com.xworkz.house.things.HouseOperation;

public class HouseRunner {
	
public static void main(String[] args) {

		
	HouseDetails details=new HouseDetails();
		
		details.setArea(222d);
		details.setPrice(100000);
		details.setAddress("Electronic City");
		details.setNumberOfRooms(40);
		
		HouseOperation operation=new HouseOperation();
		String houseDetailsOpration = operation.houseDetailsOpration(details);
		System.out.println("shopDetailsOpration : "+houseDetailsOpration);
	}


}
