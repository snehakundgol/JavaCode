package com.xworkz.fitnesscentre.runner;

import com.xworkz.fitnesscentre.dto.FitnessCentreDto;

public class FitnessCentreRunner {
	    public static void main(String[] args) {
	        FitnessCentreDto fitnessCentre = new FitnessCentreDto();
	        fitnessCentre.setName("FitnessYard Gym");
	        fitnessCentre.setLocation("BTM");
	        fitnessCentre.setCapacity(50);
	        fitnessCentre.setContactNumber("9922334466");
	        fitnessCentre.setTimings("6 AM - 10 PM");

	        System.out.println("Fitness Center details are: "+fitnessCentre);
	    }

}
