package com.xworkz.crud_operation.things;

public class SnacksOperations 
{
		SnacksDetails[] details=new SnacksDetails[5];
		int index=0;
		
		public String savedetails(SnacksDetails snacks) {
			if(snacks!=null) {
				if(index<details.length) {
					details[index]=snacks;
					index++;
					return "Snacks added Successfully";
				}else {
					return "Snacks not added beacuse array full";
				}
			}
			return "Snakcs is null.";
		}
		
		public void readDetails() 
		{
			for(int i=0;i<details.length;i++) 
			{
				System.out.println(details[i]);
			}
		}
		
		public void updateDetailsByNoOfSnacks(SnacksDetails updatedDetails) 
		{
			if(updatedDetails!=null) 
			{
				for(int i=0;i<details.length;i++) 
				{
					if(details[i]!=null
							&& details[i].getNoOfSnacks()==updatedDetails.getNoOfSnacks()) {
						details[i]=updatedDetails;
						System.out.println("Snacks updated successfully");
					}else {
						System.out.println("Snacks is not present hence unable to update");
					}
				}			
			}
		}
		
		public void deleteDetailsByNoofSnacks(int noOfSnacks) {
			if(noOfSnacks>0) {
				for(int i=0;i<details.length;i++) {			
				if(details[i]!=null
						&& details[i].getNoOfSnacks()==noOfSnacks) {
					details[i]=null;
					System.out.println("Snacks is Delted");
					}else {
						System.out.println("Snacks is not deleted");
					}
				}
			}
		}
		
		public void searchByNameOfShop(String nameOfShop) {
			if(nameOfShop!=null) {
				for(int i=0;i<details.length;i++) {
					if(details[i]!=null
							&& details[i].getName().equals(nameOfShop)) {
						System.out.println("Data is present SEARCH operation success");
					}else {
						System.out.println("Data is Not present SEARCH operation fail");
					}
				}
			}
		}
	}
		
	
		
	

