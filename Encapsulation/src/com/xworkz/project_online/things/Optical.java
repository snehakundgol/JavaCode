package com.xworkz.project_online.things;

public class Optical {
	
	private String nameOfShop;
	private String brand;
	private String shopAddress;
	private double price;
	private String ownerName;
	
	public Optical(String nameOfShop,String brand,String shopAddress,double price, String ownerName)
	{
		this.nameOfShop=nameOfShop;
		this.brand=brand;
		this.shopAddress=shopAddress;
		this.price=price;
		this.ownerName=ownerName;
	}
	
	public String toString()
	{
		return this.nameOfShop+": Name Of Shop" +
			   this.brand+": Brand"+
			   this.shopAddress+": Shop Address"+
			   this.price+": Price"+
			   this.ownerName+": Owner Name";
	}
}
