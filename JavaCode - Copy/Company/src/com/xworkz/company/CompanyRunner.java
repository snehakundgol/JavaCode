package com.xworkz.company;

public class CompanyRunner {

	public static void main(String[] args) 
	{
		Salary salary = new Salary(90000, 2000, 4000);
		
		Address address = new Address ("Dharwad", 580021, "Karnataka"); 
		
		CEO ceo = new CEO(salary, address, "Ram");
		
		Manager manager = new Manager(salary, address, "Anjali");
		
		Employee employee = new Employee(salary, address, "Deepa");
		
		Company company =new Company(ceo, manager, employee,"TCS");
		
		company.printDetails();
		
		Salary salary1 = new Salary(80000, 1000, 3000);
		
		Address address1 = new Address ("Banglore", 580222, "Karnataka"); 
		
		CEO ceo1 = new CEO(salary1, address1, "Bhagya");
		
		Manager manager1 = new Manager(salary1, address1, "Pushpa");
		
		Employee employee1 = new Employee(salary1, address1, "Heena");
		
		Company company1 =new Company(ceo1, manager1, employee1, "Wipro");
		company1.printDetails();


	}

}
