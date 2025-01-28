package com.xworkz.digilocker.runner;

import com.xworkz.digilocker.dto.DigilockerDto;
import com.xworkz.digilocker.service.DigilockerServiceImplementation;

public class DigilockerRunner {
	
	public static void main(String[] args) 
	{
        DigilockerDto digilocker = new DigilockerDto();
        digilocker.setName("Chandru");
        digilocker.setDateOfBirth("15/08/1990");
        digilocker.setAadhaarNumber("123456789012");
        digilocker.setMobileNumber("12345678891");
        digilocker.setEmail("chandru@gmail.com");
        digilocker.setUsername("chandru90");
        digilocker.setPassword("Gmail@123");
        digilocker.setGender("Male");
        digilocker.setAddress("123, BTM, Banglore");
        digilocker.setPinCode("560001");
        
System.out.println("Locker Details are: "+digilocker);
		
		
	}
}
