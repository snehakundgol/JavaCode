package com.xworkz.project_online.things;

public class Pen 
{	
	private int numberOfPens;
	private String penName;
	private String penColor;
	private String penBrand;
	private int penPrice;
	
	public Pen(int numberOfPens, String penName, String penColor, String penBrand, int penPrice)
	{
		this.numberOfPens = numberOfPens;
		this.penName = penName;
		this.penColor = penColor;
		this.penBrand = penBrand;
		this.penPrice = penPrice;
		
	}
	
	public int getnumberOfPens() 
	{
		return numberOfPens;
	}
	public String getpenName() 
	{
		return penName;
	}
	public String getpenColor() 
	{
		return penColor;
	}
	public String getpenBrand() 
	{
		return penBrand;
	}
	public int getpenPrice() 
	{
		return penPrice;
	}
	
	public void setnumberOfPens(int numberOfPens) { 
		this.numberOfPens = numberOfPens;
	}
	public void setpenName(String penName) { 
		this.penName = penName;
	}
	public void setpenColor(String penColor) { 
		this.penColor = penColor;
	}
	public void setpenBrand(String penBrand) { 
		this.penBrand = penBrand;
	}
	public void setpenPrice(int penPrice) { 
		this.penPrice = penPrice;
	}
	
	@Override
	public String toString() {
		return "Pen Details: \n" + "Number Of Pens: " + numberOfPens + "\n" + "Pen Name: " + penName + "\n"
				+ "Pen Color: " + penColor + "\n" + "Pen Brand: " + penBrand + "\n" + "Pen Price: " + penPrice;
	}
}
