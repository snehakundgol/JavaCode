package com.xworkz.project_online.things;

public class Desktop extends Application1 {
    private String operatingSystem;

    public Desktop() {
        super(); 
        this.operatingSystem = "Windows";
    }

    public Desktop(String appName, String version, String developer, String operatingSystem) {
        super(appName, version, developer); 
        this.operatingSystem = operatingSystem;
    }

    public void displayDesktopInfo() {
        displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }
}