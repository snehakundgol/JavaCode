package com.xworkz.shop.things;

public class ShopOperation {
	
	ShopDetails[] details=new ShopDetails[5];
	int index=0;
	private Object updateDetails;
	public String shopDetailsOpration(ShopDetails shopDetails) {
		
		if(shopDetails!=null) {
			System.out.println("data not null save data ");
			
			if(index<details.length) {
				details[index]=shopDetails;
				index++;
				return "data save";
			}else {
				return "array alrady full";
			}
			
		}
		return "data shows null";
	}
		
	
		public void updateByShopId(ShopDetails updatedDetails)
		{
		System.out.println("updated details :"+updatedDetails);
		if(updatedDetails != null)
		{
		System.out.println("not null");
		for(int i=0;i<details.length;i++)
		{
		if(details[i] != null && details[i].getShopId() == updateDetails.getShopId())
		{
		details[i] = updatedDetails;
		System.out.println("it is updated");
		}
		else
		{
		System.out.println("not updated");
		}
		}
		}
		else 
		{
		System.out.println("it is null");
		}
	}

}
