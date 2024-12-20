package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Train;

//Runner Class
public class TrainRunner 
{
 public static void main(String[] args) 
 {
	 Train train = new Train();
   	 train.setTrainName("Belgavi Express");
     train.setTrainNumber(246789);
     train.setDestination("Hubli-Dharwad");

     System.out.println("Train Details:");
     System.out.println("Train Name: " + train.getTrainName());
     System.out.println("Train Number: " + train.getTrainNumber());
     System.out.println("Destination: " + train.getDestination());
 
 }
 
}
