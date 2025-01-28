package com.xworkz.t20.dto;

import java.util.Objects;

public class T20Dto {
	
	private String teamName;
    private String captainName;
    private int totalRunsScored;
    private int totalWicketsLost;
    private double oversPlayed;
    private String manOfTheMatch;
    private String matchResult;
	public T20Dto(String teamName, String captainName, int totalRunsScored, int totalWicketsLost, double oversPlayed,
			String manOfTheMatch, String matchResult) {
		super();
		this.teamName = teamName;
		this.captainName = captainName;
		this.totalRunsScored = totalRunsScored;
		this.totalWicketsLost = totalWicketsLost;
		this.oversPlayed = oversPlayed;
		this.manOfTheMatch = manOfTheMatch;
		this.matchResult = matchResult;
	}
	public T20Dto() {
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getTotalWicketsLost() {
		return totalWicketsLost;
	}
	public void setTotalWicketsLost(int totalWicketsLost) {
		this.totalWicketsLost = totalWicketsLost;
	}
	public double getOversPlayed() {
		return oversPlayed;
	}
	public void setOversPlayed(double oversPlayed) {
		this.oversPlayed = oversPlayed;
	}
	public String getManOfTheMatch() {
		return manOfTheMatch;
	}
	public void setManOfTheMatch(String manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}
	public String getMatchResult() {
		return matchResult;
	}
	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}
	@Override
	public int hashCode() {
		return Objects.hash(captainName, manOfTheMatch, matchResult, oversPlayed, teamName, totalRunsScored,
				totalWicketsLost);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		T20Dto other = (T20Dto) obj;
		return Objects.equals(captainName, other.captainName) && Objects.equals(manOfTheMatch, other.manOfTheMatch)
				&& Objects.equals(matchResult, other.matchResult)
				&& Double.doubleToLongBits(oversPlayed) == Double.doubleToLongBits(other.oversPlayed)
				&& Objects.equals(teamName, other.teamName) && totalRunsScored == other.totalRunsScored
				&& totalWicketsLost == other.totalWicketsLost;
	}
	@Override
	public String toString() {
		return "T20Dto [teamName=" + teamName + ", captainName=" + captainName + ", totalRunsScored=" + totalRunsScored
				+ ", totalWicketsLost=" + totalWicketsLost + ", oversPlayed=" + oversPlayed + ", manOfTheMatch="
				+ manOfTheMatch + ", matchResult=" + matchResult + "]";
	}
  }
