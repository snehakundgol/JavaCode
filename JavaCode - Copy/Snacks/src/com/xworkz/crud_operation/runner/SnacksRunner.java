package com.xworkz.crud_operation.runner;

import com.xworkz.crud_operation.things.SnacksDetails;
import com.xworkz.crud_operation.things.SnacksOperations;

public class SnacksRunner {
	
	public static void main(String[] args) {
		SnacksDetails details=new SnacksDetails();
		details.setName("Sneha");
		details.setPrice(50);
		details.setNoOfSnacks(10);
		details.setQuantity(4);
		details.setId(2);
		
		SnacksDetails details2=new SnacksDetails();
		details.setName("Varshita");
		details.setPrice(30);
		details.setNoOfSnacks(10);
		details.setQuantity(6);
		details.setId(4);
		
		SnacksOperations operations=new SnacksOperations();
		operations.savedetails(details);
		operations.savedetails(details2);
		
		SnacksDetails updateDetails=new SnacksDetails();
		updateDetails.setId(4);
		updateDetails.setName("Sneha");
		updateDetails.setPrice(30);
		updateDetails.setQuantity(6);
		updateDetails.setNoOfSnacks(10);
		
		operations.updateDetailsByNoOfSnacks(updateDetails);
		System.out.println("=======================READ Operation after update==========================");
		operations.readDetails();
	}
}