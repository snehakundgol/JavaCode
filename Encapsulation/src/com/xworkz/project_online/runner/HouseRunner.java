package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.House;

public class HouseRunner 
{
	public static void main(String[] args) 
    {
        House house = new House("123 Maple St", 4, 222.5, true, 450000);
        System.out.println(house); 
    }
}
