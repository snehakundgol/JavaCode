package com.xworkz.project_online.things;


public class MobileApp extends Application1 {
 private boolean isOfflineSupport;

 public MobileApp() {
     super(); 
     this.isOfflineSupport = false;
 }

 public MobileApp(String appName, String version, String developer, boolean isOfflineSupport) {
     super(appName, version, developer); 
     this.isOfflineSupport = isOfflineSupport;
 }

 public void displayMobileAppInfo() {
     displayInfo();
     System.out.println("Offline Support: " + isOfflineSupport);
 }
}