package com.xworkz.crud_operation.runner;

import com.xworkz.crud_operation.things.LinkedInDetails;
import com.xworkz.crud_operation.things.LinkedInOperations;

public class LinkedInRunner {
	
	private Object gmail;

	public static void main(String[] args) {
		LinkedInDetails details=new LinkedInDetails();
		details.setId(2);
		details.setLocation("BTM");
		details.setSkills("Java");
		details.setName("Sneha");
		details.setEmail("sneha@gmail.com");
		
		LinkedInDetails details2=new LinkedInDetails();
		details.setId(6);
		details.setLocation("Hubli");
		details.setSkills("PHP");
		details.setName("Nandana");
		details.setEmail("nandana@gmail.com");
		
		LinkedInDetails details3=new LinkedInDetails();
		details.setId(6);
		details.setLocation("Dharwad");
		details.setSkills("Data Analyst");
		details.setName("Purushottam");
		details.setEmail("purushottam@gmail.com");
		
		LinkedInDetails details4=new LinkedInDetails();
		details.setId(10);
		details.setLocation("Dhavangere");
		details.setSkills("Cyber Security");
		details.setName("Varshita");
		details.setEmail("varshita@gmail.com");
		
		LinkedInOperations inOperations=new LinkedInOperations();
		inOperations.saveDetails(details);
		inOperations.saveDetails(details2);
		inOperations.saveDetails(details3);
		inOperations.saveDetails(details4);
		
		System.out.println("======================READ============================");
		inOperations.readDetails();
		System.out.println("=====================Delete===========================");
		inOperations.deleteByUserId("Varshita");
		System.out.println("====================Search=============================");
		inOperations.searchByUserid("Dharwad");
		
		LinkedInDetails updateDetails= new LinkedInDetails();
		updateDetails.setName("Heena");
		updateDetails.setSkills("Maven");
		updateDetails.setLocation("Andra");
		updateDetails.setId(3);
		updateDetails.setEmail("heena@gmail.com");
		System.out.println("=====================After Update read===========================");
		inOperations.updateByUserId(updateDetails);
		inOperations.readDetails();			
	}
	}
