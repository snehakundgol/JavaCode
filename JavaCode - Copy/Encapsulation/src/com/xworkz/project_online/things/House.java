package com.xworkz.project_online.things;

public class House 
{
	private String address;
    private int numberOfRooms;
    private double area; 
    private boolean hasGarage;
    private double price;

    public House(String address, int numberOfRooms, double area, boolean hasGarage, double price) 
    {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
        this.hasGarage = hasGarage;
        this.price = price;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() 
    {
		return "House Details: \n" + "Address: " + address + "\n" + "Number of Rooms: " + numberOfRooms + "\n"
				+ "Area: " + area + "\n" + "Has Garage: " + hasGarage + "\n" + "Price: " + price;
	}

    
}


