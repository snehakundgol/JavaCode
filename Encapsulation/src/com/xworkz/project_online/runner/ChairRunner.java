package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Chair;

public class ChairRunner 
{
		public static void main(String[] args) 
		{
        Chair chair = new Chair("Wood", "Brown", 7.5, true, 150.0);
        System.out.println(chair); 
		}
}
