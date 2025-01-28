package com.xworkz.project_online.things;

public class Application {
   
    private String appName;
    private String developer;
    private double version;
    private int downloads;
    private boolean isPaid;

    public Application(String appName, String developer, double version, int downloads, boolean isPaid) {
        this.appName = appName;
        this.developer = developer;
        this.version = version;
        this.downloads = downloads;
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "Application Details: \n" +
               "App Name: " + appName + "\n" +
               "Developer: " + developer + "\n" +
               "Version: " + version + "\n" +
               "Downloads: " + downloads + "\n" +
               "Paid: " + (isPaid ? "Yes" : "No");
    }
}

