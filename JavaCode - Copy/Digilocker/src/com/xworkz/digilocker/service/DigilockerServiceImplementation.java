package com.xworkz.digilocker.service;

public class DigilockerServiceImplementation {
	
	public boolean validateName(String name) 
	{
        if (name == null || name.isEmpty()) 
        {
            System.out.println("Invalid Name: Name cannot be empty.");
            return false;
        }
        System.out.println("Valid Name");
        return true;
    }

    public boolean validateDateOfBirth(String dateOfBirth) 
    {
        if (dateOfBirth == null || !dateOfBirth.matches("\\d{2}/\\d{2}/\\d{4}")) 
        {
            System.out.println("Invalid Date of Birth: Use format DD/MM/YYYY.");
            return false;
        }
        System.out.println("Valid Date of Birth");
        return true;
    }

    public boolean validateAadhaarNumber(String aadhaarNumber) {
        if (aadhaarNumber == null || !aadhaarNumber.matches("\\d{12}")) {
            System.out.println("Invalid Aadhaar Number: It must be a 12-digit number.");
            return false;
        }
        System.out.println("Valid Aadhaar Number");
        return true;
    }

    public boolean validateMobileNumber(String mobileNumber) {
        if (mobileNumber == null || !mobileNumber.matches("\\d{10}")) {
            System.out.println("Invalid Mobile Number: It must be a 10-digit number.");
            return false;
        }
        System.out.println("Valid Mobile Number");
        return true;
    }

    public boolean validateEmail(String email) {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$")) {
            System.out.println("Invalid Email: Provide a valid email address.");
            return false;
        }
        System.out.println("Valid Email");
        return true;
    }

    public boolean validateUsername(String username) {
        if (username == null || username.length() < 5) {
            System.out.println("Invalid Username: It must be at least 5 characters long.");
            return false;
        }
        System.out.println("Valid Username");
        return true;
    }

    public boolean validatePassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Invalid Password: It must be at least 8 characters long.");
            return false;
        }
        System.out.println("Valid Password");
        return true;
    }

    public boolean validateGender(String gender) {
        if (gender == null || (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))) {
            System.out.println("Invalid Gender: Choose Male, Female, or Other.");
            return false;
        }
        System.out.println("Valid Gender");
        return true;
    }

    public boolean validateAddress(String address) 
    {
        if (address == null || address.isEmpty()) {
            System.out.println("Invalid Address: Address cannot be empty.");
            return false;
        }
        System.out.println("Valid Address");
        return true;
    }

    public boolean validatePinCode(String pinCode) 
    {
        if (pinCode == null || !pinCode.matches("\\d{6}")) 
        {
            System.out.println("Invalid Pin Code: It must be a 6-digit number.");
            return false;
        }
        System.out.println("Valid Pin Code");
        return true;
    }
}

