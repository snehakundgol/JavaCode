package com.xworkz.project_online.things;

public class Application1 {

 protected String appName;
 protected String version;
 protected String developer;
 protected String releaseDate;
 protected int downloadCount;
 protected boolean isPremium;
 protected String platform;
 protected double rating;
 protected String supportedLanguages;
 protected String category;
 
 public Application1() {
     this("Unknown", "1.0", "Unknown", "01-01-2020", 0, false, "All", 0.0, "English", "General");
 }

 public Application1(String appName, String version) {
     this(appName, version, "Unknown", "01-01-2020", 0, false, "All", 0.0, "English", "General");
 }

 public Application1(String appName, String version, String developer) {
     this(appName, version, developer, "01-01-2020", 0, false, "All", 0.0, "English", "General");
 }

 public Application1(String appName, String version, String developer, String releaseDate) {
     this(appName, version, developer, releaseDate, 0, false, "All", 0.0, "English", "General");
 }

 public Application1(String appName, String version, String developer, String releaseDate, int downloadCount) {
     this(appName, version, developer, releaseDate, downloadCount, false, "All", 0.0, "English", "General");
 }

 public Application1(String appName, String version, String developer, String releaseDate, int downloadCount, boolean isPremium) {
     this(appName, version, developer, releaseDate, downloadCount, isPremium, "All", 0.0, "English", "General");
 }

 public Application1(String appName, String version, String developer, String releaseDate, int downloadCount, boolean isPremium, String platform) {
     this(appName, version, developer, releaseDate, downloadCount, isPremium, platform, 0.0, "English", "General");
 }

 public Application1(String appName, String version, String developer, String releaseDate, int downloadCount, boolean isPremium, String platform, double rating) {
     this(appName, version, developer, releaseDate, downloadCount, isPremium, platform, rating, "English", "General");
 }

 public Application1(String appName, String version, String developer, String releaseDate, int downloadCount, boolean isPremium, String platform, double rating, String supportedLanguages) {
     this(appName, version, developer, releaseDate, downloadCount, isPremium, platform, rating, supportedLanguages, "General");
 }

 public Application1(String appName, String version, String developer, String releaseDate, int downloadCount, boolean isPremium, String platform, double rating, String supportedLanguages, String category) {
     this.appName = appName;
     this.version = version;
     this.developer = developer;
     this.releaseDate = releaseDate;
     this.downloadCount = downloadCount;
     this.isPremium = isPremium;
     this.platform = platform;
     this.rating = rating;
     this.supportedLanguages = supportedLanguages;
     this.category = category;
 }

 public void displayInfo() {
     System.out.println("App Name: " + appName);
     System.out.println("Version: " + version);
     System.out.println("Developer: " + developer);
     System.out.println("Release Date: " + releaseDate);
     System.out.println("Download Count: " + downloadCount);
     System.out.println("Premium: " + isPremium);
     System.out.println("Platform: " + platform);
     System.out.println("Rating: " + rating);
     System.out.println("Supported Languages: " + supportedLanguages);
     System.out.println("Category: " + category);
 }
}

