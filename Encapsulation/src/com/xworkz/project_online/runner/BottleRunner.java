package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Bottle;

public class BottleRunner 
{
	public static void main(String[] args) 
    {
        Bottle bottle = new Bottle("Stainless Steel", "Silver", 1.0, true, 20.99);
        System.out.println(bottle); 
    }
}
