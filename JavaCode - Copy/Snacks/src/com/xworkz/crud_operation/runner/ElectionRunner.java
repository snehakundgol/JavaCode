package com.xworkz.crud_operation.runner;

import com.xworkz.crud_operation.things.Election;
import com.xworkz.crud_operation.things.IndianElection;
import com.xworkz.crud_operation.things.PakistanElection;
import com.xworkz.crud_operation.things.SriLankaElection;

public class ElectionRunner {
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		
		Election indian = new IndianElection();
		indian.electionProcess();
		
		Election pakistan = new PakistanElection();
		pakistan.electionProcess();
		
		Election srilankha = new SriLankaElection();
		srilankha.electionProcess();
	}

}
