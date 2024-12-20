package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Office;

public class OfficeRunner 
{
	
    public static void main(String[] args) 
    {
        Office office = new Office("Infosys", "BTM", 200, 1500.5, true);
        System.out.println(office);
    }
}
