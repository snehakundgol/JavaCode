package com.xworkz.ecommerceapplication.runner;

import com.xworkz.ecommerceapplication.dto.ProductDto;
import com.xworkz.ecommerceapplication.service.EcommerceService;
import com.xworkz.ecommerceapplication.service.EcommerceServiceImplementation;

public class EcommerceApplicationRunner 
{
    public static void main(String[] args) 
    {
        System.out.println("main method started");
        ProductDto productDto = new ProductDto();
        productDto.setProductCode(200);
        productDto.setProductName("Book");

        System.out.println("product dto in method: " + productDto);
        EcommerceService service = new EcommerceServiceImplementation();
        service.validateAndSave(productDto);
      }
}
