package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Account;

public class AccountRunner 
{
    public static void main(String[] args) 
    {
        Account account = new Account("1234567890", "Seema", 5000.75, "Savings", "Downtown Branch");
        System.out.println(account);
    }
}
