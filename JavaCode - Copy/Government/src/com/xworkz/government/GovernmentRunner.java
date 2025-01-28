package com.xworkz.government;

public class GovernmentRunner {
    public static void main(String[] args) {
        
        Scheme scheme1 = new Scheme("Health Care", "Improving public health", 500);
        Scheme scheme2 = new Scheme("Education", "Improving literacy rate", 300);

        
        MLA mla1 = new MLA("Govind", "Constituency A", 5);

       
        Minister minister1 = new Minister("Jagadish", "Health", 10);
        
        Minister minister2 = (minister1);
        

       
        ChiefMinister cm1 = new ChiefMinister("Joshi", 7, "State A");

       
        Government govt = new Government("Central Government", "Country A");

       
        govt.displayDetails();
    }
}