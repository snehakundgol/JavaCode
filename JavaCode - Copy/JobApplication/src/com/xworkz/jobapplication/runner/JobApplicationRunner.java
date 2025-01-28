package com.xworkz.jobapplication.runner;

import java.util.Scanner;

import com.xworkz.jobapplication.things.JobApplicationService;

public class JobApplicationRunner {
    private static JobApplicationService jobService = new JobApplicationService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while (true) {
            System.out.println("\nJob Application Menu:");
            System.out.println("1. Create Application");
            System.out.println("2. Read Applications");
            System.out.println("3. Update Application");
            System.out.println("4. Delete Application");
            System.out.println("5. Search by ID");
            System.out.println("6. Search by Place");
            System.out.println("7. Search by Email");
            System.out.println("8. Search by Language");
            System.out.println("9. Search by Job Role");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int i = scanner.nextInt();

            if (i == 1) {
                createApplication();
            } else if (i == 2) {
                readApplications();
            } else if (i == 3) {
                updateApplication();
            } else if (i == 4) {
                deleteApplication();
            } else if (i == 5) {
                searchById();
            } else if (i == 6) {
                searchByPlace();
            } else if (i == 7) {
                searchByEmail();
            } else if (i == 8) {
                searchByLanguage();
            } else if (i == 9) {
                searchByJobRole();
            } else if (i == 10) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void createApplication() {
        scanner.nextLine(); 
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter place: ");
        String place = scanner.nextLine();
        System.out.print("Enter language: ");
        String language = scanner.nextLine();
        System.out.print("Enter job role: ");
        String jobRole = scanner.nextLine();
        jobService.createApplication(name, email, place, language, jobRole);
    }

    private static void readApplications() {
        jobService.readApplications();
    }

    private static void updateApplication() {
        System.out.print("Enter the ID of the application to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new email: ");
        String newEmail = scanner.nextLine();
        System.out.print("Enter new place: ");
        String newPlace = scanner.nextLine();
        System.out.print("Enter new language: ");
        String newLanguage = scanner.nextLine();
        System.out.print("Enter new job role: ");
        String newJobRole = scanner.nextLine();
        jobService.updateApplication(id, newName, newEmail, newPlace, newLanguage, newJobRole);
    }

    private static void deleteApplication() {
        System.out.print("Enter the ID of the application to delete: ");
        int id = scanner.nextInt();
        jobService.deleteApplication(id);
    }

    private static void searchById() {
        System.out.print("Enter the ID to search: ");
        int id = scanner.nextInt();
        jobService.searchById(id);
    }

    private static void searchByPlace() {
        scanner.nextLine(); 
        System.out.print("Enter the place to search: ");
        String place = scanner.nextLine();
        jobService.searchByPlace(place);
    }

    private static void searchByEmail() {
        scanner.nextLine(); 
        System.out.print("Enter the email to search: ");
        String email = scanner.nextLine();
        jobService.searchByEmail(email);
    }

    private static void searchByLanguage() {
        scanner.nextLine(); 
        System.out.print("Enter the language to search: ");
        String language = scanner.nextLine();
        jobService.searchByLanguage(language);
    }

    private static void searchByJobRole() {
        scanner.nextLine(); 
        System.out.print("Enter the job role to search: ");
        String jobRole = scanner.nextLine();
        jobService.searchByJobRole(jobRole);
    }
}
