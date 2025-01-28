package com.xworkz.project_online.things;

public class Webapp extends Application1 {
    private boolean isCloudBased;

    public Webapp() {
        super(); 
        this.isCloudBased = false;
    }

    public Webapp(String appName, String version, String developer, boolean isCloudBased) {
        super(appName, version, developer);  
        this.isCloudBased = isCloudBased;
    }

    public void displayWebappInfo() {
        displayInfo();
        System.out.println("Cloud Based: " + isCloudBased);
    }
}



