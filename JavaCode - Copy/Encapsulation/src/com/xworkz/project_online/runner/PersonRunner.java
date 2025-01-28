package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Person;

public class PersonRunner 
{
	
    public static void main(String[] args) 
    {
        Person person = new Person("Megha", 28, "Female", "EC", "1234567890");
        System.out.println(person);
    }
}
