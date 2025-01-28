package com.xworkz.house.things;

import com.xworkz.house.things.HouseDetails;

public class HouseOperation {
	
	HouseDetails[] details=new HouseDetails[5];
	int index=0;
	public String houseDetailsOpration(HouseDetails houseDetails) {
		
		if(houseDetails!=null) {
			System.out.println("House added successfully ");
			
			if(index<details.length) {
				details[index]=houseDetails;
				index++;
				return "No houses available";
			}else {
				return "List of houses";
			}
			
		}
		return "data shows null";
	}
}
