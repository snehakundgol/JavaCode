package com.xworkz.house.things;

import java.util.Objects;

public class HouseDetails {
	
    private String address;
    private int numberOfRooms;
    private double area; 
    private double price;
    
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
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, area, numberOfRooms, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HouseDetails other = (HouseDetails) obj;
		return Objects.equals(address, other.address)
				&& Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area) 
				&& numberOfRooms == other.numberOfRooms
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public String toString() {
		return "HouseDetails [address=" + address + ", numberOfRooms=" + numberOfRooms + ", area=" + area
				+ ", hasGarage="  + ", price=" + price + "]";
	}
    
    

}
