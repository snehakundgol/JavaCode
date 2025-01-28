package com.xworkz.googleapps.things;

import com.xworkz.googleapps.things.GoogleAppsDetails;

public class GoogleAppsOperation {

	GoogleAppsDetails[] details=new GoogleAppsDetails[2];
	int index=0;
	public String googleappsDetailsOpration(GoogleAppsDetails googleappsDetails) {
		
		if(googleappsDetails!=null) {
			System.out.println("App not null");
			
			if(index<details.length) {
				details[index]=googleappsDetails;
				index++;
				return " apps saved";
			}else {
				return "app not saved";
			}
			
		}
		return "data shows null";
	}
}
