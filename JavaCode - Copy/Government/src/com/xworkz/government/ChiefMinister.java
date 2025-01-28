package com.xworkz.government;

public class ChiefMinister 
{
     String name;
     int termYears;
     String state;

   
    public ChiefMinister(String name, int termYears, String state) 
    {
        this.name = name;
        this.termYears = termYears;
        this.state = state;
       
    }

    public void displayInfo() 
    {
        System.out.println("Chief Minister: " + name);
        System.out.println("Term Years: " + termYears);
        System.out.println("State: " + state);
        System.out.println("Ministers:");
        
    }
}
