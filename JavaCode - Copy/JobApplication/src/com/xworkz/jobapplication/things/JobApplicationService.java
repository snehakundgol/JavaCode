package com.xworkz.jobapplication.things;

import java.util.ArrayList;
import java.util.List;

public class JobApplicationService 
{
	    private List<JobApplication> applications = new ArrayList<>();
	    private int currentId = 1;

	    public void createApplication(String name, String email, String place, String language, String jobRole) {
	        JobApplication application = new JobApplication(currentId++, name, email, place, language, jobRole);
	        applications.add(application);
	        System.out.println("Job Application created successfully: " + application);
	    }

	    public void readApplications() {
	        if (applications.isEmpty()) {
	            System.out.println("No job applications found.");
	        } else {
	            for (JobApplication app : applications) {
	                System.out.println(app);
	            }
	        }
	    }

	    public void updateApplication(int id, String newName, String newEmail, String newPlace, String newLanguage, String newJobRole) {
	        for (JobApplication app : applications) {
	            if (app.getId() == id) {
	                app.setName(newName);
	                app.setEmail(newEmail);
	                app.setPlace(newPlace);
	                app.setLanguage(newLanguage);
	                app.setJobRole(newJobRole);
	                System.out.println("Job Application updated successfully: " + app);
	                return;
	            }
	        }
	        System.out.println("Job Application with ID " + id + " not found.");
	    }

	    public void deleteApplication(int id) {
	        for (JobApplication app : applications) {
	            if (app.getId() == id) {
	                applications.remove(app);
	                System.out.println("Job Application deleted successfully.");
	                return;
	            }
	        }
	        System.out.println("Job Application with ID " + id + " not found.");
	    }

	    public void searchById(int id) {
	        for (JobApplication app : applications) {
	            if (app.getId() == id) {
	                System.out.println("Found: " + app);
	                return;
	            }
	        }
	        System.out.println("Job Application with ID " + id + " not found.");
	    }

	    public void searchByPlace(String place) {
	        boolean found = false;
	        for (JobApplication app : applications) {
	            if (app.getPlace().equalsIgnoreCase(place)) {
	                System.out.println(app);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No job applications found for place: " + place);
	        }
	    }

	    public void searchByEmail(String email) {
	        for (JobApplication app : applications) {
	            if (app.getEmail().equalsIgnoreCase(email)) {
	                System.out.println("Found: " + app);
	                return;
	            }
	        }
	        System.out.println("No job applications found for email: " + email);
	    }

	    public void searchByLanguage(String language) {
	        boolean found = false;
	        for (JobApplication app : applications) {
	            if (app.getLanguage().equalsIgnoreCase(language)) {
	                System.out.println(app);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No job applications found for language: " + language);
	        }
	    }

	    public void searchByJobRole(String jobRole) {
	        boolean found = false;
	        for (JobApplication app : applications) {
	            if (app.getJobRole().equalsIgnoreCase(jobRole)) {
	                System.out.println(app);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No job applications found for job role: " + jobRole);
	        }
	    }
	}

