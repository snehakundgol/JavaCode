package com.xworkz.government;

public class Minister {
    String name;
    String portfolio;
    int experience;

    public Minister(String name, String portfolio, int experience) 
    {
        this.name = name;
        this.portfolio = portfolio;
        this.experience = experience;
       
    }

    public void displayInfo() 
    {
        System.out.println("Minister: " + name);
        System.out.println("Portfolio:" + portfolio);
        System.out.println("Experience:" + experience + "years");
       
    }
}