package com.xworkz.linkedinprofile.runner;

import java.util.Scanner;

public class LinkedInProfileRunner {
public class Main {
	    private static LinkedInService linkedInService = new LinkedInService();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\nLinkedIn Profile Menu:");
	            System.out.println("1. Create Profile");
	            System.out.println("2. Read Profiles");
	            System.out.println("3. Update Profile");
	            System.out.println("4. Delete Profile");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            if (choice == 1) {
	                createProfile();
	            } else if (choice == 2) {
	                readProfiles();
	            } else if (choice == 3) {
	                updateProfile();
	            } else if (choice == 4) {
	                deleteProfile();
	            } else if (choice == 5) {
	                System.out.println("Exiting...");
	                break;
	            } else {
	                System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }

	    private static void createProfile() {
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter email: ");
	        String email = scanner.nextLine();
	        System.out.print("Enter headline: ");
	        String headline = scanner.nextLine();
	        System.out.print("Enter skills: ");
	        String skills = scanner.nextLine();
	        System.out.print("Enter location: ");
	        String location = scanner.nextLine();
	        linkedInService.createProfile(name, email, headline, skills, location);
	    }

	    private static void readProfiles() {
	        linkedInService.readProfiles();
	    }

	    private static void updateProfile() {
	        System.out.print("Enter the ID of the profile to update: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Enter new name: ");
	        String newName = scanner.nextLine();
	        System.out.print("Enter new email: ");
	        String newEmail = scanner.nextLine();
	        System.out.print("Enter new headline: ");
	        String newHeadline = scanner.nextLine();
	        System.out.print("Enter new skills: ");
	        String newSkills = scanner.nextLine();
	        System.out.print("Enter new location: ");
	        String newLocation = scanner.nextLine();
	        linkedInService.updateProfile(id, newName, newEmail, newHeadline, newSkills, newLocation);
	    }

	    private static void deleteProfile() {
	        System.out.print("Enter the ID of the profile to delete: ");
	        int id = scanner.nextInt();
	        linkedInService.deleteProfile(id);
	    }
	}

}
