package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Bus;

public class BusRunner 
{
	
    public static void main(String[] args) 
    {
        Bus bus = new Bus("KA-01-1234", "Prakash", 50, "Downtown to Uptown", true);
        System.out.println(bus);
    }
	
    
}
