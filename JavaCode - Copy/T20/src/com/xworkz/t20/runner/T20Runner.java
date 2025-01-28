package com.xworkz.t20.runner;

import com.xworkz.t20.dto.T20Dto;

public class T20Runner {
	
	public static void main(String[] args) {
        T20Dto match = new T20Dto();
        match.setTeamName("RCB");
        match.setCaptainName("Kohli");
        match.setTotalRunsScored(210);
        match.setTotalWicketsLost(6);
        match.setOversPlayed(19.5);
        match.setManOfTheMatch("Ravindra Jadeja");
        match.setMatchResult("Win");

        System.out.println("Library details are: "+match);
    }
}

