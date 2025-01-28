package com.xworkz.hotel.things;

import java.util.Objects;

class Hotel 
{
    private int id;
    public Hotel(int id, String name, String location, double pricePerNight) 
    {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.pricePerNight = pricePerNight;
	}
	private String name;
    private String location;
    private double pricePerNight;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, location, name, pricePerNight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return id == other.id && Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(pricePerNight) == Double.doubleToLongBits(other.pricePerNight);
	}
   }

