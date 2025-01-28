package com.xworkz.company;

public class Company {
	
	CEO ceo;
	Manager manager;
	Employee employee;
	String companyName;

	public Company (CEO ceo, Manager manager,Employee employee,String companyName)
	{
		this.ceo = ceo;
		this.manager = manager;
		this.employee = employee;
		this.companyName = companyName;
		
	}
	
	public void printDetails() {
		System.out.println("CEO name"+ceo.ceoName);
		System.out.println("CEO address area"+ceo.address.area);
		System.out.println("CEO address pincode"+ceo.address.pinCode);
		System.out.println("CEO address state"+ceo.address.state);
		System.out.println("CEO basic salary"+ceo.salary.basicSalary);
		System.out.println("CEO HRA"+ceo.salary.HRA);
		System.out.println("CEO PF"+ceo.salary.PF);
		System.out.println("Manager name"+manager.managerName);
		System.out.println("Manager address area"+manager.address.area);
		System.out.println("Manager address pincode"+manager.address.pinCode);
		System.out.println("Manager address state"+manager.address.state);
		System.out.println("Manager basic salary"+manager.salary.basicSalary);
		System.out.println("Manager HRA"+manager.salary.HRA);
		System.out.println("Manager PF"+manager.salary.PF);
		System.out.println("Employee name"+employee.employeeName);
		System.out.println("Employee address area"+employee.address.area);
		System.out.println("Employee address pincode"+employee.address.pinCode);
		System.out.println("Employee address state"+employee.address.state);
		System.out.println("Employee basic salary"+employee.salary.basicSalary);
		System.out.println("Employee HRA"+employee.salary.HRA);
		System.out.println("Employee PF"+employee.salary.PF);
		System.out.println("Company name"+companyName);
		
		
	}

}
