package com.xworkz.project_online.things;

public class Office 
{
    private String name;
    private String address;
    private int numberOfEmployees;
    private double area;
    private boolean hasParking;

   
    public Office(String name, String address, int numberOfEmployees, double area, boolean hasParking) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.area = area;
        this.hasParking = hasParking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    @Override
    public String toString() 
    {
		return "Office Details: \n" + "Name: " + name + "\n" + "Address: " + address + "\n"
				+ "Number of Employees: " + numberOfEmployees + "\n" + "Area: " + area + "\n" + "Has Parking: " + hasParking;
	}

    
}
