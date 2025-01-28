package com.xworkz.fitnesscentre.service;

public class FitnessCentreImplementation {

    public boolean validateName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid Name: Name cannot be empty.");
            return false;
        }
        System.out.println("Valid Name");
        return true;
    }

    public boolean validateLocation(String location) {
        if (location == null || location.isEmpty()) {
            System.out.println("Invalid Location: Location cannot be empty.");
            return false;
        }
        System.out.println("Valid Location");
        return true;
    }

    public boolean validateCapacity(int capacity) {
        if (capacity <= 0) {
            System.out.println("Invalid Capacity: Capacity must be greater than 0.");
            return false;
        }
        System.out.println("Valid Capacity");
        return true;
    }

    public boolean validateContactNumber(String contactNumber) {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            System.out.println("Invalid Contact Number: Must be a 10-digit number.");
            return false;
        }
        System.out.println("Valid Contact Number");
        return true;
    }

    public boolean validateTimings(String timings) {
        if (timings == null || timings.isEmpty()) {
            System.out.println("Invalid Timings: Timings cannot be empty.");
            return false;
        }
        System.out.println("Valid Timings");
        return true;
    }
}
