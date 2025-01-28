package com.xworkz.government;


public class Scheme {
  String name;
  String description;
  double budget;

 public Scheme(String name, String description, double budget) 
 {
     this.name = name;
     this.description = description;
     this.budget = budget;
 }

 public void displayInfo() {
     System.out.println("Scheme: " + name);
     System.out.println("Description: " + description);
     System.out.println("Budget: " + budget + " million");
 }
}