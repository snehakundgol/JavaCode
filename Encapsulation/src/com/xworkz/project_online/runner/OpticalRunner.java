package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Optical;

public class OpticalRunner {
	public static void main(String[] args)
	{
		Optical optical = new Optical("Lenskart", "Ray-Ban", "Banglore", 299, "Madan");
		System.out.println(optical.toString());
	}

}
