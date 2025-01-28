package com.xworkz.t20.service;

public class T20ServiceImplementation {
    public boolean validateTeamName(String teamName) 
    {
        if (teamName == null || teamName.isEmpty()) 
        {
            System.out.println("Invalid Team Name: Team name cannot be empty.");
            return false;
        }
        System.out.println("Valid Team Name");
        return true;
    }

   
    public boolean validateCaptainName(String captainName) 
    {
        if (captainName == null || captainName.isEmpty()) 
        {
            System.out.println("Invalid Captain Name: Captain name cannot be empty.");
            return false;
        }
        System.out.println("Valid Captain Name");
        return true;
    }

    public boolean validateTotalRunsScored(int totalRunsScored) 
    {
        if (totalRunsScored < 0) 
        {
            System.out.println("Invalid Total Runs Scored: Runs cannot be negative.");
            return false;
        }
        System.out.println("Valid Total Runs Scored");
        return true;
    }

    public boolean validateTotalWicketsLost(int totalWicketsLost) {
        if (totalWicketsLost < 0 || totalWicketsLost > 10) {
            System.out.println("Invalid Total Wickets Lost: Wickets must be between 0 and 10.");
            return false;
        }
        System.out.println("Valid Total Wickets Lost");
        return true;
    }

    public boolean validateOversPlayed(double oversPlayed) 
    {
        if (oversPlayed < 0 || oversPlayed > 20) 
        {
            System.out.println("Invalid Overs Played: Overs must be between 0 and 20.");
            return false;
        }
        System.out.println("Valid Overs Played");
        return true;
    }

    public boolean validateManOfTheMatch(String manOfTheMatch) {
        if (manOfTheMatch == null || manOfTheMatch.isEmpty()) {
            System.out.println("Invalid Man of the Match: Name cannot be empty.");
            return false;
        }
        System.out.println("Valid Man of the Match");
        return true;
    }

    public boolean validateMatchResult(String matchResult) {
        if (matchResult == null || (!matchResult.equalsIgnoreCase("Win") &&
                                     !matchResult.equalsIgnoreCase("Loss") &&
                                     !matchResult.equalsIgnoreCase("Tie"))) {
            System.out.println("Invalid Match Result: Result must be Win, Loss, or Tie.");
            return false;
        }
        System.out.println("Valid Match Result");
        return true;
    }
}
