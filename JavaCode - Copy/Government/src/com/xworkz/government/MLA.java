package com.xworkz.government;

public class MLA {
     String name;
     String constituency;
     int termYears;

   
    public MLA(String name, String constituency, int termYears) 
    {
        this.name = name;
        this.constituency = constituency;
        this.termYears = termYears;
        
    }

    public void displayInfo() 
    {
        System.out.println("MLA: " + name);
        System.out.println("Constituency: " + constituency);
        System.out.println("Term Years: " + termYears);
        System.out.println("Schemes:");
       
    }
}


