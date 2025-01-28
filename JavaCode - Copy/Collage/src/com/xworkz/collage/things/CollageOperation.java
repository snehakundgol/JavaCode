package com.xworkz.collage.things;

import com.xworkz.collage.things.CollageDetails;

public class CollageOperation {

	CollageDetails[] details=new CollageDetails[6];
	int index=0;
	
    public String collageDetailsOpration(CollageDetails collageDetails) {
		
		if(collageDetails!=null) {
			System.out.println("data not null save data ");
			
			if(index<details.length) {
				details[index]=collageDetails;
				index++;
				return "data save";
			}else {
				return "array alrady full";
			}
			
		}
		return "data shows null";
    }
}
