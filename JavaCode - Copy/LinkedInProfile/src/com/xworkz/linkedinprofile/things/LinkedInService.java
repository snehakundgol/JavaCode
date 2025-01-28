package com.xworkz.linkedinprofile.things;

import java.util.ArrayList;
import java.util.List;

class LinkedInService {
    private List<LinkedInProfile> profiles = new ArrayList<>();
    private int i = 1;

    public void createProfile(String name, String email, String headline, String skills, String location) {
        LinkedInProfile profile = new LinkedInProfile(i++, name, email, headline, skills, location);
        profiles.add(profile);
        System.out.println("Profile created successfully: " + profile);
    }

    public void readProfiles() {
        if (profiles.isEmpty()) {
            System.out.println("No profiles found.");
        } else {
            for (LinkedInProfile profile : profiles) {
                System.out.println(profile);
            }
        }
    }

    public void updateProfile(int id, String newName, String newEmail, String newHeadline, String newSkills, String newLocation) {
        for (LinkedInProfile profile : profiles) {
            if (profile.getId() == id) {
                profile.setName(newName);
                profile.setEmail(newEmail);
                profile.setHeadline(newHeadline);
                profile.setSkills(newSkills);
                profile.setLocation(newLocation);
                System.out.println("Profile updated successfully: " + profile);
                return;
            }
        }
        System.out.println("Profile with ID " + id + " not found.");
    }

    public void deleteProfile(int id) {
        for (LinkedInProfile profile : profiles) {
            if (profile.getId() == id) {
                profiles.remove(profile);
                System.out.println("Profile deleted successfully.");
                return;
            }
        }
        System.out.println("Profile with ID " + id + " not found.");
    }
}

