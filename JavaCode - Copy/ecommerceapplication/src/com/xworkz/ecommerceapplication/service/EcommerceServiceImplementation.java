package com.xworkz.ecommerceapplication.service;

import com.xworkz.ecommerceapplication.dto.ProductDto;

public class EcommerceServiceImplementation extends EcommerceService
{
	@Override
	public String validateAndSave(ProductDto dto)
	{
		System.out.println("validate and same method invoked dto:" +dto);
		if(dto!=null)
		{
			if(dto.getProductCode()>0 
				   && dto.getProductName()!=null
				   && dto.getProductName().length()>3
				   {
					   System.out.println("product dto is validated and ready for save");
					   return "saved";
				   }
				   else
				   {
					   System.err.println("product name should be >3 char and should not be null");
				   }
				}
			else
			{
				System.err.println("check the product code and product name");
			}
		return "not saved";
}
}
