package com.xworkz.project_online.things;

public class Account 
{
	
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String branchName;

    public Account(String accountNumber, String accountHolderName, double balance, String accountType, String branchName) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.branchName = branchName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    
    @Override
    public String toString() {
        return "Account {" +
                "Account Number='" + accountNumber + '\'' +
                ", Account Holder Name='" + accountHolderName + '\'' +
                ", Balance=$" + balance +
                ", Account Type='" + accountType + '\'' +
                ", Branch Name='" + branchName + '\'' +
                '}';
    }
    
    @Override
    public String toString() 
    {
		return "Account Details: \n" + "Account Number: " + accountNumber + "\n" + "Account Holder Name: " + accountHolderName + "\n"
				+ "Balance: " + balance + "\n" + "Account Type: " + accountType + "\n" + "Branch Name: " + branchName;
	}
    

    
}
