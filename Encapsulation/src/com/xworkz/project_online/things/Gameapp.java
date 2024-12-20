package com.xworkz.project_online.things;

public class Gameapp extends Application1 
{
 private String genre;

 public Gameapp() 
 {
     super(); 
     this.genre = "Action";
 }

 public Gameapp(String appName, String version, String developer, String genre) 
 {
     super(appName, version, developer); 
     this.genre = genre;
 }

 public void displayGameAppInfo() 
 {
     displayInfo();
     System.out.println("Genre: " + genre);
 }
}