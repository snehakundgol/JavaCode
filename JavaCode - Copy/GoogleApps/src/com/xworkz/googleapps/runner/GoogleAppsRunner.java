package com.xworkz.googleapps.runner;

import com.xworkz.googleapps.things.GoogleAppsDetails;
import com.xworkz.googleapps.things.GoogleAppsOperation;

public class GoogleAppsRunner {
	
public static void main(String[] args) {

		
	GoogleAppsDetails details=new GoogleAppsDetails();
		
		details.getId();
		details.getCategory();
		details.getName();
		
		GoogleAppsOperation operation=new GoogleAppsOperation();
		String googleappsDetailsOpration = operation.googleappsDetailsOpration(details);
		System.out.println("googleappsDetailsOpration : "+googleappsDetailsOpration);

}
}
