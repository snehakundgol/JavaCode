package com.xworkz.crud_operation.things;

public class LinkedInOperations {
	LinkedInDetails[] details=new LinkedInDetails[5];
	int index=0;
	private int Id;
	
	public String saveDetails(LinkedInDetails link) 
	{
		if(link!=null) 
		{
			if(index < details.length) 
			{
				details[index]=link;
				index++;
				return "Profile created Successfully";
			}
		}
		else 
		{
		return "Profile is not saved because Arry is full";	
		}
		return "Profile is null";
	}
	
	public void readDetails() {
		for(int i=0;i<details.length;i++) {
			System.out.println(details[i]);
		}
	}
	
	public void deleteByUserId(String userId) {
		if(userId!=null) {
			for(int i=0;i<details.length;i++) { 
				if(details[i]!=null
						&& details[i].getId()==Id) {
					details[i]=null;
					System.out.println("Profile deleted successfully");
				}else {
					System.out.println("Profile is not deleted");
				}
			}
		}
	}
	
	public void updateByUserId(LinkedInDetails updatedetails) {
		if(updatedetails!=null) {
			for(int i=0;i<details.length;i++) {
				if(details[i]!=null
						&& details[i].getId()==updatedetails.getId()) {
					details[i]=updatedetails;
					System.out.println("Profile updated Successfully");
				}else {
					System.out.println("Profile is not updated");
				}
			}
		}
	}
	
	public void searchByUserid(String userId) {
		if(userId!=null) {
			for(int i=0;i<details.length;i++) {
				if(details[i]!=null
						&& details[i].getUserId().equals(userId)) {
					System.out.println("Profile is matched");
					System.out.println(details[i]);
				}else {
					System.out.println("Profile is not matched");
				}
			}
		}
	}
}
